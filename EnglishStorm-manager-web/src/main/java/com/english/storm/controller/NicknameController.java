package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.NicknameService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息呢称接口
 */
@Controller
public class NicknameController {

    @Autowired
    private NicknameService nicknameService;


    @RequestMapping(value = "/user/update/nickname", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateNickname(String token, String nickname) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(nickname)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = nicknameService.updateNickname(token, nickname);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}