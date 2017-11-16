package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.SexService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息性别接口
 */
@Controller
public class SexController {

    @Autowired
    private SexService sexService;


    @RequestMapping(value = "/user/update/sex", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateSex(String token, String sex) {
        EnglishStormResult result;
        try {

            if (TextUtils.isEmpty(sex)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = sexService.updateSex(token, sex);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);

        }
        return result;
    }


}