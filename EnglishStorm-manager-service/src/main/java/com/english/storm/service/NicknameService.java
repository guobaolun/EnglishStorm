package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface NicknameService {
	EnglishStormResult updateNickname(String token, String nickname) throws IOException;
}
