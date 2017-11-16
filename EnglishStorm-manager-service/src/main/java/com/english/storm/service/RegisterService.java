package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
/**
 * @author guobaolun
 */
public interface RegisterService {
	EnglishStormResult addUser(String userId, String password, String checkCode,String nickname,String country,String province,String city);
}
