package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.EnglishCircle;
import com.baomidou.mybatisplus.service.IService;

import java.io.IOException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
public interface IEnglishCircleService extends IService<EnglishCircle> {
    EnglishStormResult addEnglishCircle(String token, String content, String voiceFile, Integer voiceTime, String voiceImageFile, String imageList) throws IOException;
    EnglishStormResult findEnglishCircleList(int page, int rows, long time) throws IOException;
}
