package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface PortraitService {
	EnglishStormResult updataPortrait(String token, String portrait) throws IOException;

}
