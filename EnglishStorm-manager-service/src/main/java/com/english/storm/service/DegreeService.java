package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface DegreeService {
	EnglishStormResult updateDegree( String token, String degree) throws IOException;
}
