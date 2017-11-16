package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户登录接口
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult login(String userId, String passWord) {
        EnglishStormResult result;
        try {
            result = loginService.getUser(userId, passWord);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}