package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.EnglishCircleData;
import com.english.storm.entity.PageListResponse;
import com.english.storm.mapper.EnglishCircleMapper;
import com.english.storm.mapper.UserMapper;
import com.english.storm.pojo.EnglishCircle;
import com.english.storm.pojo.EnglishCircleExample;
import com.english.storm.pojo.User;
import com.english.storm.service.CircleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * @author guobaolun
 * 英语圈子
 */
@Service
public class CircleServiceImpl implements CircleService {

    @Autowired
    private EnglishCircleMapper englishCircleMapper;

    @Autowired
    private UserMapper userMapper;


    @Value("${IMAGE_SERVER_BASE_URL}")
    private String imageServerBaseUrl;


    @Value("${IMAGE_THUMBNAIL_360}")
    private String imageThumbnail360;

    @Value("${IMAGE_THUMBNAIL_720}")
    private String imageThumbnail720;


    @Value("${IMAGE_WATERMARK}")
    private String imageWatermark;


    private static final int UPDATE_ERROR = 0;

    @Autowired
    private JedisClient jedisClient;




    @Override

    public EnglishStormResult addEnglishCircle(String token, String content, String voiceFile, Integer voiceTime, String voiceImageFile, String imageList) throws IOException {

        String userInfoStr = jedisClient.get(token);
        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        User user = JsonUtils.jsonToObject(userInfoStr, User.class);


        if(!TextUtils.isEmpty(imageList)){
            String[] imgArr = imageList.split(",");
            imageList = JsonUtils.objectToJson(imgArr);
        }

        EnglishCircle englishCircle = new EnglishCircle();
        englishCircle.setId(UUID.randomUUID().toString());
        englishCircle.setUserId(user.getUserId());
        englishCircle.setTime(System.currentTimeMillis());
        englishCircle.setContent(content);
        englishCircle.setVoice(voiceFile);
        englishCircle.setVoiceTime(voiceTime);
        englishCircle.setVoiceImg(voiceImageFile);
        englishCircle.setImageList(imageList);
        englishCircle.setCommentCount(0);
        englishCircle.setPraiseCount(0);
        englishCircle.setAccusation(0);

        int updateCount = englishCircleMapper.insert(englishCircle);


        //修改数据失败
        if (updateCount == UPDATE_ERROR) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok();
    }

    @Override
    public EnglishStormResult getEnglishCircle(Integer page, Integer rows, Long time) throws IOException {

        PageHelper.startPage(page, rows);
        EnglishCircleExample example = new EnglishCircleExample();
        example.setOrderByClause("time DESC");

        if (time > 0) {
            EnglishCircleExample.Criteria criteria = example.createCriteria();
            criteria.andTimeLessThanOrEqualTo(time);
        }


        List<EnglishCircle> selectList = englishCircleMapper.selectByExample(example);

        PageInfo<EnglishCircle> pageInfo = new PageInfo<>(selectList);

        PageListResponse listResult = new PageListResponse();
        listResult.setIsFirstPage(pageInfo.isIsFirstPage());
        listResult.setIsLastPage(pageInfo.isIsLastPage());
        listResult.setPageNum(pageInfo.getPageNum());
        listResult.setPages(pageInfo.getPages());
        listResult.setPageSize(pageInfo.getPageSize());
        listResult.setSize(pageInfo.getSize());
        listResult.setTotal(pageInfo.getTotal());
        List<EnglishCircle> list = pageInfo.getList();

        ArrayList<EnglishCircleData> dataList = new ArrayList<>();

        for (EnglishCircle englishCircle : list) {

            User user = userMapper.selectByPrimaryKey(englishCircle.getUserId());

            EnglishCircleData data = new EnglishCircleData();
            data.setId(englishCircle.getId());
            data.setTime(englishCircle.getTime());
            data.setContent(englishCircle.getContent());
            data.setCommentCount(englishCircle.getCommentCount());
            data.setPraiseCount(englishCircle.getPraiseCount());
            data.setAccusation(englishCircle.getAccusation());
            data.setNickname(user.getNickname());
            data.setPortrait(imageServerBaseUrl + user.getPortrait() + imageThumbnail360);

            String voice = englishCircle.getVoice();
            if (!TextUtils.isEmpty(voice)) {
                data.setVoice(imageServerBaseUrl + voice);
            } else {
                data.setVoice("");
            }

            String voiceImg = englishCircle.getVoiceImg();
            if (TextUtils.isEmpty(voiceImg)) {
                data.setVoiceImg("");
                data.setVoiceImgThumbnail("");
            } else {
                data.setVoiceImg(imageServerBaseUrl + englishCircle.getVoiceImg() + imageWatermark);
                data.setVoiceImgThumbnail(imageServerBaseUrl + englishCircle.getVoiceImg() + imageThumbnail360);
            }

            String imageListStr = englishCircle.getImageList();
            if (!TextUtils.isEmpty(imageListStr)) {

                List<String> imageList = JsonUtils.jsonToList(imageListStr,String.class);
                ArrayList<String> imageThumbnailList = new ArrayList<>();

                for (int i = 0; i < imageList.size(); i++) {
                    String path = imageServerBaseUrl + imageList.get(i);
                    imageList.set(i, path + imageWatermark);
                    if (imageList.size() == 1) {
                        imageThumbnailList.add(path + imageThumbnail720);
                    } else {
                        imageThumbnailList.add(path + imageThumbnail360);
                    }
                }
                data.setImageList(imageList);
                data.setImageThumbnailList(imageThumbnailList);
            } else {
                data.setImageList(new ArrayList<String>());
                data.setImageThumbnailList(new ArrayList<String>());
            }
            dataList.add(data);
        }

        listResult.setList(dataList);


        return EnglishStormResult.ok(listResult);

    }


}
