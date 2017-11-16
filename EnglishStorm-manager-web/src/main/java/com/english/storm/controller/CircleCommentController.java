package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.CircleCommentService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 英语圈评论接口
 */
@Controller
public class CircleCommentController {

    @Autowired
    private CircleCommentService commentService;

    private static final int ROWS = 10;

    //    private static final int TYPE_CONTENT = 0;

    private static final int TYPE_VOICE = 1;




    @RequestMapping(value = "/englishCircle/comment/add", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addComment(String token, String articleId,String content,String voice,Integer voiceTime,Integer type) {
        EnglishStormResult result;
        try {

            if (TextUtils.isEmpty(articleId)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            if (type == TYPE_VOICE) {
                if (TextUtils.isEmpty(voice) || voiceTime <= 0) {
                    return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
                }
            }else{
                if (TextUtils.isEmpty(content)) {
                    return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
                }
            }

            result = commentService.addComment(token, articleId,content,voice,voiceTime,type);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/englishCircle/comment/get", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getComment(String articleId, Integer page, Long time) {
        EnglishStormResult result;
        try {

            if (TextUtils.isEmpty(articleId)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            result = commentService.getComment(articleId,page,ROWS,time);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



}