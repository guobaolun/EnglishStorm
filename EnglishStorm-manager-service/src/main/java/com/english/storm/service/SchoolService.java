package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface SchoolService {
	EnglishStormResult updateSchool(String token, String school) throws IOException;
}
