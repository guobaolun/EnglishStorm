package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.RegisterService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 *         用户注册接口
 */
@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;


    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addUser(String userId, String passWord, String checkCode, String nickname, String country, String province, String city) {
        EnglishStormResult result;

        try {

            if (TextUtils.isEmpty(userId) || TextUtils.isEmpty(passWord) || TextUtils.isEmpty(checkCode)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            result = registerService.addUser(userId, passWord, checkCode, nickname, country, province, city);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}