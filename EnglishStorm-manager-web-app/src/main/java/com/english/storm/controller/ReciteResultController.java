package com.english.storm.controller;


import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.dao.JedisClient;
import com.english.storm.service.IReciteResultService;
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
@RequestMapping("/storm/reciteResult")
public class ReciteResultController {


    @Autowired
    private IReciteResultService reciteResultService;



    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addReciteResult(String token, String resultData) {
        EnglishStormResult result;
        try {
            result = reciteResultService.addReciteResult(token,resultData);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }






}

