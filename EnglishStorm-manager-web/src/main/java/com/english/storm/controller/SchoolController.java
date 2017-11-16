package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息学校接口
 */
@Controller
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/user/update/school", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateSchool(String token, String school) {
        EnglishStormResult result;
        try {
            result = schoolService.updateSchool(token, school);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }
}