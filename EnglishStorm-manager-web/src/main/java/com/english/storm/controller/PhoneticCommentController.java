package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.PhoneticCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 音标评论接口
 */
@Controller
public class PhoneticCommentController {

    @Autowired
    private PhoneticCommentService commentService;




    @RequestMapping(value = "/phonetic/comment/add", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addComment(String token,String articleId,String content, String voice, Integer voiceTime, Integer type) {
        EnglishStormResult result;
        try {
            result = commentService.addComment( token,articleId,content,voice,voiceTime,type);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/phonetic/comment/get", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getComment(String articleId, Integer page, Long time) {
        EnglishStormResult result;
        try {
            result = commentService.getComment(articleId,page,10,time);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



}