package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.EnglishCircleChildComment;
import com.english.storm.entity.User;
import com.english.storm.mapper.EnglishCircleChildCommentMapper;
import com.english.storm.service.IEnglishCircleChildCommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class EnglishCircleChildCommentServiceImpl extends ServiceImpl<EnglishCircleChildCommentMapper, EnglishCircleChildComment> implements IEnglishCircleChildCommentService {


    @Autowired
    private JedisClient jedisClient;


    @Override
    public EnglishStormResult addChildComment(String token, long commentId, String targetUserId, String content, String voice, Integer voiceTime, Integer type) throws IOException {

        String userInfoStr = jedisClient.get(token);
        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }
        User user = JsonUtils.jsonToObject(userInfoStr, User.class);
        Date date = new Date();
        EnglishCircleChildComment childComment = new EnglishCircleChildComment();
        childComment.setGmtCreate(date);
        childComment.setGmtModified(date);
        childComment.setCommentId(commentId);
        childComment.setUserId(user.getUserId());
        childComment.setTargetUserId(targetUserId);
        childComment.setContent(content);
        childComment.setVoice(voice);
        childComment.setVoiceTime(voiceTime);
        childComment.setType(type);
        childComment.setCommentCount(0);
        childComment.setPraiseCount(0);
        childComment.setTime(System.currentTimeMillis());

        boolean isOk = childComment.insert();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok();
    }

}
