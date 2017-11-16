package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface SexService {
	EnglishStormResult updateSex(String token, String sex) throws IOException;
}
