package com.english.storm.controller;


import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IEnglishCircleService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Controller
@RequestMapping("/storm/englishCircle")
public class EnglishCircleController {


    @Autowired
    private IEnglishCircleService englishCircleService;

    private static final int ROWS = 10;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
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

            result = englishCircleService.addEnglishCircle(token, content, voiceFile, voiceTime, voiceImageFile, imageList);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getEnglishCircle(Integer page, Long time) {


        EnglishStormResult result;
        try {
            result = englishCircleService.findEnglishCircleList(page, ROWS, time);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }

}

