package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface PhoneticChildCommentService {



	EnglishStormResult addChildComment(String token, String commentId,String targetUserId, String content, String voice, Integer voiceTime, Integer type) throws IOException;
}
