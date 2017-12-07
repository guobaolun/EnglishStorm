package com.english.storm.controller;


import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IUserService;
import com.english.storm.service.impl.UserServiceImpl;
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
@RequestMapping("/storm/user")
public class UserController {

    @Autowired
    private IUserService userService;

    private final static long SECOND = 1000;
    private final static long MINUTE = 60 * SECOND;
    private final static long HOUR = 60 * MINUTE;
    private final static long DAY = 24 * HOUR;
    private final static long YEAR = 360 * DAY;
    private final static long MAX_BIRTHDAY = 100 * YEAR;



    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult login(String userId, String passWord) {
        EnglishStormResult result;
        try {
            result = userService.findUser(userId, passWord);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addUser(String userId, String passWord, String checkCode, String nickname, String country, String province, String city) {
        EnglishStormResult result;

        try {
            if (TextUtils.isEmpty(userId) || TextUtils.isEmpty(passWord) || TextUtils.isEmpty(checkCode)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            result = userService.addUser(userId, passWord, checkCode, nickname, country, province, city);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }




    @RequestMapping(value = "/update/birthday", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateBirthday(String token, long birthday) {
        EnglishStormResult result;
        try {

            if (birthday > System.currentTimeMillis() || System.currentTimeMillis() - birthday > MAX_BIRTHDAY) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }

            result = userService.updateBirthday(token, birthday);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/update/degree", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateDegree(String token, String degree) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(degree)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = userService.updateDegree(token, degree);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



    @RequestMapping(value = "/update/introduce", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateIntroduce(String token, String introduce) {
        EnglishStormResult result;
        try {

            if (TextUtils.isEmpty(introduce)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = userService.updateIntroduce(token, introduce);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



    @RequestMapping(value = "/update/nickname", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateNickname(String token, String nickname) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(nickname)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = userService.updateNickname(token, nickname);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/update/portrait", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updatePortrait(String token, String portrait) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(portrait)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = userService.updatePortrait(token, portrait);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



    @RequestMapping(value = "/update/school", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateSchool(String token, String school) {
        EnglishStormResult result;
        try {
            result = userService.updateSchool(token, school);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }

    @RequestMapping(value = "/update/sex", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateSex(String token, int sex) {
        EnglishStormResult result;
        try {

            result = userService.updateSex(token, sex);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);

        }
        return result;
    }



    @RequestMapping(value = "/update/speciality", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateSpeciality(String token,String speciality) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(speciality)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = userService.updateSpeciality(token,speciality);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



}

