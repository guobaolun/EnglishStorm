package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.mapper.PhoneticChildCommentMapper;
import com.english.storm.pojo.PhoneticChildComment;
import com.english.storm.pojo.User;
import com.english.storm.service.PhoneticChildCommentService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.UUID;

/**
 * @author guobaolun
 * 音标子评论
 */
@Service
public class PhoneticChildCommentServiceImpl implements PhoneticChildCommentService {

    @Autowired
    private PhoneticChildCommentMapper childCommentMapper;

    private static final int UPDATE_ERROR = 0;

    @Autowired
    private JedisClient jedisClient;





    @Override
    public EnglishStormResult addChildComment(String token, String commentId,String targetUserId, String content, String voice, Integer voiceTime, Integer type) throws IOException {

        String userInfoStr = jedisClient.get(token);

        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }
        User user = JsonUtils.jsonToObject(userInfoStr, User.class);

        PhoneticChildComment childComment = new PhoneticChildComment();
        childComment.setId(UUID.randomUUID().toString());
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

        int updateCount = childCommentMapper.insert(childComment);

        //修改数据失败
        if (updateCount == UPDATE_ERROR) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok();
    }











}
