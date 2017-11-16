package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface IntroduceService {
	EnglishStormResult updateIntroduce(String token,String introduce) throws IOException;
}
