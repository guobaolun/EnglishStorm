package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.ReciteResult;
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
public interface IReciteResultService extends IService<ReciteResult> {
    EnglishStormResult addReciteResult(String token, String resultData) throws IOException;
}
