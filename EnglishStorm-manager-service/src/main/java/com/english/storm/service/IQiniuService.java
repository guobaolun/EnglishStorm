package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;

/**
 * @author guobaolun
 */
public interface IQiniuService {
	EnglishStormResult getToken(String token) throws IOException;
}
