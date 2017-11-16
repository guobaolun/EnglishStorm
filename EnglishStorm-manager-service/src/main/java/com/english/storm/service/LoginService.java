package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.fasterxml.jackson.core.JsonProcessingException;
/**
 * @author guobaolun
 */
public interface LoginService {
	EnglishStormResult getUser(String userId, String password) throws JsonProcessingException;
}
