package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息生日接口
 */
@Controller
public class BirthdayController {

    @Autowired
    private BirthdayService birthdayService;

    private final static long SECOND = 1000;
    private final static long MINUTE = 60 * SECOND;
    private final static long HOUR = 60 * MINUTE;
    private final static long DAY = 24 * HOUR;
    private final static long YEAR = 360 * DAY;
    private final static long MAX_BIRTHDAY = 100 * YEAR;

    @RequestMapping(value = "/user/update/birthday", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateBirthday(String token, long birthday) {
        EnglishStormResult result;
        try {

            if (birthday > System.currentTimeMillis() || System.currentTimeMillis() - birthday > MAX_BIRTHDAY) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            result = birthdayService.updateBirthday(token, birthday);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}