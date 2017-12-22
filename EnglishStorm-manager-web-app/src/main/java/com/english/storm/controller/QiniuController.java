package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IQiniuService;
import com.mysql.fabric.xmlrpc.base.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author guobaolun
 * 获取七牛上传令牌接口
 */
@Controller
@RequestMapping("/storm")
public class QiniuController {


    @Autowired
    private IQiniuService qiniuService;



    @RequestMapping(value = "/uploadFile/getUpToken", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getToken(String token) {
        EnglishStormResult result;
        try {
            result = qiniuService.getToken(token);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public EnglishStormResult getTest() {
        return EnglishStormResult.ok(new Date());
    }


}
