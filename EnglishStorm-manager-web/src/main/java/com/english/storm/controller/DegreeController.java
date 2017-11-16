package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.DegreeService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息学历接口
 */
@Controller
public class DegreeController {

    @Autowired
    private DegreeService degreeService;


    @RequestMapping(value = "/user/update/degree", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateDegree(String token, String degree) {
        EnglishStormResult result;
        try {
            if (TextUtils.isEmpty(degree)) {
                return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50002);
            }
            result = degreeService.updateDegree(token, degree);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}