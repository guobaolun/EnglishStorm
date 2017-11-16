package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.SpecialityService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息专业接口
 */
@Controller
public class SpecialityController {

    @Autowired
    private SpecialityService specialityService;


    @RequestMapping(value = "/user/update/speciality", method = RequestMethod.POST)
    @ResponseBody
        public EnglishStormResult updateSpeciality(String token,String speciality) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(speciality)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = specialityService.updateSpeciality(token,speciality);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}