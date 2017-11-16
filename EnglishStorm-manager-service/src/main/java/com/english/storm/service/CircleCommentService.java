package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;

/**
 * @author guobaolun
 */
public interface CircleCommentService {
	EnglishStormResult addComment(String token, String articleId,String content,String voice,Integer voiceTime,Integer type) throws IOException;

	EnglishStormResult getComment(String articleId,Integer page, Integer rows,Long time);
}
