package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.CircleChildCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author guobaolun
 * 音标子评论接口
 */
@Controller
public class PhoneticChildCommentController {

    @Autowired
    private CircleChildCommentService childCommentService;


    @RequestMapping(value = "/phonetic/childComment", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addChildComment(String token, String commentId, String targetUserId, String content, String voice, int voiceTime, int type) {
        EnglishStormResult result;
        try {
            result = childCommentService.addChildComment(token, commentId,targetUserId,content,voice,voiceTime,type);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}