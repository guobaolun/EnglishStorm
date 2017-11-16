package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.CircleService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 *         英语圈接口
 */
@Controller
public class CircleController {

    @Autowired
    private CircleService circleService;

    private static final int ROWS = 10;


    @RequestMapping(value = "/englishCircle/add", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getEnglishCircle(String token, String content, String voiceFile, Integer voiceTime, String voiceImageFile, String imageList) {

        EnglishStormResult result;
        try {

            if (TextUtils.isEmpty(content)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            if (!TextUtils.isEmpty(voiceFile)) {
                if (TextUtils.isEmpty(voiceImageFile) || voiceTime <= 0) {
                    return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
                }
            }

            result = circleService.addEnglishCircle(token, content, voiceFile, voiceTime, voiceImageFile, imageList);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/englishCircle/get", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getEnglishCircle(Integer page, Long time) {


        EnglishStormResult result;
        try {
            result = circleService.getEnglishCircle(page, ROWS, time);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}