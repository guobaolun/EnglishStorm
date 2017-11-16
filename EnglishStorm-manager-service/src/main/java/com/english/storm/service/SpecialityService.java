package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface SpecialityService {
	EnglishStormResult updateSpeciality(String token, String speciality) throws IOException;
}
