package com.english.storm.controller;


import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IEnglishCircleCommentService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Controller
@RequestMapping("/storm/englishCircleComment")
public class EnglishCircleCommentController {


    @Autowired
    private IEnglishCircleCommentService englishCircleCommentService;

    private static final int ROWS = 10;

    //    private static final int TYPE_CONTENT = 0;

    private static final int TYPE_VOICE = 1;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addComment(String token, long articleId, String content, String voice, Integer voiceTime, Integer type) {
        EnglishStormResult result;
        try {


            if (type == TYPE_VOICE) {
                if (TextUtils.isEmpty(voice) || voiceTime <= 0) {
                    return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
                }
            } else {
                if (TextUtils.isEmpty(content)) {
                    return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
                }
            }

            result = englishCircleCommentService.addComment(token, articleId, content, voice, voiceTime, type);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getComment(long articleId, int page, long time) {
        EnglishStormResult result;
        try {
            result = englishCircleCommentService.findCommentList(articleId, page, ROWS, time);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }

}

