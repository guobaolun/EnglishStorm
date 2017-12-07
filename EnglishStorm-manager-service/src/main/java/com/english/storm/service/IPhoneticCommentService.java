package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.PhoneticComment;
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
public interface IPhoneticCommentService extends IService<PhoneticComment> {
    EnglishStormResult addComment(String token, long articleId, String content, String voice, int voiceTime, int type) throws IOException;
    EnglishStormResult findCommentList(long articleId, int page, int rows,long time) throws IOException;
}
