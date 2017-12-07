package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IQiniuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 获取七牛上传令牌接口
 */
@Controller
public class QiniuContriller {


    @Autowired
    private IQiniuService qiniuService;



    @RequestMapping(value = "/upfile/getUpToken", method = RequestMethod.POST)
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



}
