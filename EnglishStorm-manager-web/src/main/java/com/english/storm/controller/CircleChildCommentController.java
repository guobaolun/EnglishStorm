package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.CircleChildCommentService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author guobaolun
 * 英语圈子评论接口
 */
@Controller
public class CircleChildCommentController {

    @Autowired
    private CircleChildCommentService childCommentService;

//    private static final int TYPE_CONTENT = 0;

    private static final int TYPE_VOICE = 1;


    @RequestMapping(value = "/englishCircle/childComment", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult insertComment(String token, String commentId, String targetUserId, String content, String voice, int voiceTime, int type) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(commentId) || TextUtils.isEmpty(targetUserId) || (TextUtils.isEmpty(content))) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            if (type == TYPE_VOICE) {
                if (TextUtils.isEmpty(voice) || voiceTime <= 0) {
                    return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
                }
            }


            result = childCommentService.addChildComment(token, commentId, targetUserId, content, voice, voiceTime, type);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}