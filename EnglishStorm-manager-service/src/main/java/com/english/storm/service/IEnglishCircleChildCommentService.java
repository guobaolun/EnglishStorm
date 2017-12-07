package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.EnglishCircleChildComment;
import com.baomidou.mybatisplus.service.IService;

import java.io.IOException;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
public interface IEnglishCircleChildCommentService extends IService<EnglishCircleChildComment> {
    EnglishStormResult addChildComment(String token, long commentId, String targetUserId, String content, String voice, Integer voiceTime, Integer type) throws IOException;
}
