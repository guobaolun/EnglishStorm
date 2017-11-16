package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.PortraitService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息头像接口
 */
@Controller
public class PortraitController {

    @Autowired
    private PortraitService portraitService;



    @RequestMapping(value = "/user/update/portrait", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updatePortrait(String token, String portrait) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(portrait)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = portraitService.updataPortrait(token, portrait);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}