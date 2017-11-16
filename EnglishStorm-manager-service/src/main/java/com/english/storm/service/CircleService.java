package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;

import java.io.IOException;
/**
 * @author guobaolun
 */
public interface CircleService {
    EnglishStormResult addEnglishCircle(String token, String content, String voiceFile, Integer voiceTime, String voiceImageFile,String imageList) throws IOException;

    EnglishStormResult getEnglishCircle(Integer page, Integer rows, Long time) throws IOException;

}
