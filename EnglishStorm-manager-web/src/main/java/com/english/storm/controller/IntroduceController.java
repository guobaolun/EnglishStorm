package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IntroduceService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息个人简介接口
 */
@Controller
public class IntroduceController {

    @Autowired
    private IntroduceService introduceService;


    @RequestMapping(value = "/user/update/introduce", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateIntroduce(String token, String introduce) {
        EnglishStormResult result;
        try {

            if (TextUtils.isEmpty(introduce)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = introduceService.updateIntroduce(token, introduce);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}