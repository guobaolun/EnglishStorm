package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.WordProgress;
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
public interface IWordProgressService extends IService<WordProgress> {
//    EnglishStormResult addProgress(String token, String word) throws IOException;
    EnglishStormResult findReciteWordList(String token) throws IOException;
    EnglishStormResult getReciteWordCount(String token) throws IOException;
}
