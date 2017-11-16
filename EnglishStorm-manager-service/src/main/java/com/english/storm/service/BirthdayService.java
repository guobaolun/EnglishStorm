package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;

/**
 * @author guobaolun
 */
public interface BirthdayService {
	EnglishStormResult updateBirthday(String token, long birthday) throws IOException;
}
