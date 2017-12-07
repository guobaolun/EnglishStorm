package com.english.storm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.EnglishCircle;
import com.english.storm.entity.EnglishCircleComment;
import com.english.storm.entity.User;
import com.english.storm.mapper.EnglishCircleMapper;
import com.english.storm.modle.EnglishCircleData;
import com.english.storm.modle.PageListResponse;
import com.english.storm.service.IEnglishCircleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysql.fabric.xmlrpc.base.Data;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class EnglishCircleServiceImpl extends ServiceImpl<EnglishCircleMapper, EnglishCircle> implements IEnglishCircleService {

    @Autowired
    private JedisClient jedisClient;


    @Value("${IMAGE_SERVER_BASE_URL}")
    private String imageServerBaseUrl;


    @Value("${IMAGE_THUMBNAIL_360}")
    private String imageThumbnail360;

    @Value("${IMAGE_THUMBNAIL_720}")
    private String imageThumbnail720;


    @Value("${IMAGE_WATERMARK}")
    private String imageWatermark;


    @Override
    public EnglishStormResult addEnglishCircle(String token, String content, String voiceFile, Integer voiceTime, String voiceImageFile, String imageList) throws IOException {

        String userInfoStr = jedisClient.get(token);
        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        User user = JsonUtils.jsonToObject(userInfoStr, User.class);


        if (!TextUtils.isEmpty(imageList)) {
            String[] imgArr = imageList.split(",");
            imageList = JsonUtils.objectToJson(imgArr);
        }
        Date date = new Date();
        EnglishCircle englishCircle = new EnglishCircle();
        englishCircle.setUserId(user.getUserId());
        englishCircle.setGmtCreate(date);
        englishCircle.setGmtModified(date);
        englishCircle.setContent(content);
        englishCircle.setVoice(voiceFile);
        englishCircle.setVoiceTime(voiceTime);
        englishCircle.setVoiceImg(voiceImageFile);
        englishCircle.setImageList(imageList);
        englishCircle.setCommentCount(0);
        englishCircle.setPraiseCount(0);
        englishCircle.setIsAccusation(0);


        boolean isOk = englishCircle.insert();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok();
    }

    @Override
    public EnglishStormResult findEnglishCircleList(int page, int rows, long time) throws IOException {



        EntityWrapper<EnglishCircle> circleWrapper = new EntityWrapper<>();
        circleWrapper.orderBy("gmt_create DESC");
        if (time > 0) {
            circleWrapper.le("gmt_create", new Date(time));
        }
        Page<EnglishCircle> pageInfo = selectPage(new Page<EnglishCircle>(page, rows), circleWrapper);




        int pageSize = pageInfo.getTotal() % rows == 0 ? pageInfo.getTotal() / rows : pageInfo.getTotal() / rows + 1;
        boolean isFirstPage = page == 0;
        boolean isLastPage = page == pageSize;

        PageListResponse listResult = new PageListResponse();
        listResult.setIsFirstPage(isFirstPage);
        listResult.setIsLastPage(isLastPage);
        listResult.setPageNum(page);
        listResult.setPages(pageInfo.getPages());
        listResult.setPageSize(pageSize);
        listResult.setSize(pageInfo.getSize());
        listResult.setTotal(pageInfo.getTotal());
        List<EnglishCircle> list = pageInfo.getRecords();

        ArrayList<EnglishCircleData> dataList = new ArrayList<>();

        for (EnglishCircle englishCircle : list) {

            User user = new User();
            user = user.selectOne(new EntityWrapper<User>().eq("user_id", englishCircle.getUserId()));

            EnglishCircleData data = new EnglishCircleData();
            data.setId(englishCircle.getId());
            data.setTime(englishCircle.getGmtCreate().getTime());
            data.setContent(englishCircle.getContent());
            data.setCommentCount(englishCircle.getCommentCount());
            data.setPraiseCount(englishCircle.getPraiseCount());
            data.setAccusation(englishCircle.getIsAccusation());
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

                List<String> imageList = JsonUtils.jsonToList(imageListStr, String.class);
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
