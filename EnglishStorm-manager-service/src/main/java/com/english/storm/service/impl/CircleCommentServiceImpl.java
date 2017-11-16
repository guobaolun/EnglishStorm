package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.ChildCommentData;
import com.english.storm.entity.CommentData;
import com.english.storm.entity.PageListResponse;
import com.english.storm.mapper.EnglishCircleChildCommentMapper;
import com.english.storm.mapper.EnglishCircleCommentMapper;
import com.english.storm.mapper.UserMapper;
import com.english.storm.pojo.*;
import com.english.storm.service.CircleCommentService;
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
 * 英语圈评论
 */
@Service
public class CircleCommentServiceImpl implements CircleCommentService {

    @Autowired
    private EnglishCircleCommentMapper commentMapper;

    @Autowired
    private EnglishCircleChildCommentMapper childCommentMapper;

    @Autowired
    private UserMapper userMapper;

    private static final int UPDATE_ERROR = 0;

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String imageServerBaseUrl;

    @Autowired
    private JedisClient jedisClient;



    @Override
    public EnglishStormResult addComment(String token,String articleId, String content, String voice, Integer voiceTime, Integer type) throws IOException {

        String userInfoStr = jedisClient.get(token);

        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }
        User user = JsonUtils.jsonToObject(userInfoStr, User.class);


        UUID uuid = UUID.randomUUID();

        EnglishCircleComment comment = new EnglishCircleComment();
        comment.setCommentCount(0);
        comment.setPraiseCount(0);
        comment.setTime(System.currentTimeMillis());
        comment.setId(uuid.toString());
        comment.setArticleId(articleId);
        comment.setUserId(user.getUserId());
        comment.setContent(content);
        comment.setVoice(voice);
        comment.setVoiceTime(voiceTime);
        comment.setType(type);
        comment.setCommentCount(0);
        comment.setPraiseCount(0);
        comment.setTime(System.currentTimeMillis());

        int updateCount = commentMapper.insert(comment);

        //修改数据失败
        if (updateCount == UPDATE_ERROR) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok();
    }


    @Override
    public EnglishStormResult getComment(String articleId, Integer page, Integer rows,Long time) {

        PageHelper.startPage(page, rows);
        EnglishCircleCommentExample example = new EnglishCircleCommentExample();
        example.setOrderByClause("time DESC");

        EnglishCircleCommentExample.Criteria criteria = example.createCriteria();
        if (time > 0) {
            criteria.andTimeLessThanOrEqualTo(time);
        }
        criteria.andArticleIdEqualTo(articleId);

        List<EnglishCircleComment> selectList = commentMapper.selectByExample(example);

        PageInfo<EnglishCircleComment> pageInfo = new PageInfo<>(selectList);

        PageListResponse listResult = new PageListResponse();
        listResult.setIsFirstPage(pageInfo.isIsFirstPage());
        listResult.setIsLastPage(pageInfo.isIsLastPage());
        listResult.setPageNum(pageInfo.getPageNum());
        listResult.setPages(pageInfo.getPages());
        listResult.setPageSize(pageInfo.getPageSize());
        listResult.setSize(pageInfo.getSize());
        listResult.setTotal(pageInfo.getTotal());
        List<EnglishCircleComment> list = pageInfo.getList();

        ArrayList<CommentData> dataList = new ArrayList<>();

        for (EnglishCircleComment comment : list) {
            User user = userMapper.selectByPrimaryKey(comment.getUserId());

            CommentData commentData = new CommentData();

            commentData.setId(comment.getId());
            commentData.setArticleId(articleId);
            commentData.setUserId(comment.getUserId());
            commentData.setNickname(user.getNickname());
            commentData.setPortrait(imageServerBaseUrl+user.getPortrait());
            commentData.setTime(comment.getTime());
            if(comment.getType() == 0){
                commentData.setContent(comment.getContent());
            }else{
                commentData.setVoice(imageServerBaseUrl+comment.getVoice());
                commentData.setVoiceTime(comment.getVoiceTime());
            }
            commentData.setType(comment.getType());
            commentData.setCommentCount(comment.getCommentCount());
            commentData.setPraiseCount(comment.getPraiseCount());

            PageHelper.startPage(0, 5);
            EnglishCircleChildCommentExample childCommentExample = new EnglishCircleChildCommentExample();
            childCommentExample.setOrderByClause("time DESC");

            EnglishCircleChildCommentExample.Criteria childCommentCriteria = childCommentExample.createCriteria();
            childCommentCriteria.andTimeLessThanOrEqualTo(time);
            childCommentCriteria.andCommentIdEqualTo(comment.getId());

            List<EnglishCircleChildComment> selectChildComment = childCommentMapper.selectByExample(childCommentExample);

            PageInfo<EnglishCircleChildComment> childPageInfo = new PageInfo<>(selectChildComment);
            List<EnglishCircleChildComment> childCommentList = childPageInfo.getList();
            ArrayList<ChildCommentData> childCommentDataList = new ArrayList<>();


            for (EnglishCircleChildComment childComment :childCommentList) {
                User childUser = userMapper.selectByPrimaryKey(childComment.getUserId());

                User childTargetUser = userMapper.selectByPrimaryKey(childComment.getTargetUserId());

                ChildCommentData data =  new ChildCommentData(
                        childComment.getId(),
                        childComment.getCommentId(),
                        childComment.getUserId(),
                        childUser.getNickname(),
                        childUser.getPortrait(),
                        childTargetUser.getUserId(),
                        childTargetUser.getNickname(),
                        childComment.getTime(),
                        comment.getContent(),
                        childComment.getVoice(),
                        childComment.getVoiceTime(),
                        childComment.getType(),
                        childComment.getPraiseCount() );
                childCommentDataList.add(data);

            }

            commentData.setChildConmentList(childCommentDataList);

            dataList.add(commentData);
        }

        listResult.setList(dataList);


        return EnglishStormResult.ok(listResult);
    }


}
