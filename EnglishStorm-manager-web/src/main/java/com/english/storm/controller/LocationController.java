package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.LocationService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guobaolun
 * 用户个人信息地址接口
 */
@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/user/update/location", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult updateLocation(String token, int type, String country, String province, String city, String area) {
        EnglishStormResult result;
        try {
            result = locationService.updateLocation(token, type, country, province, city, area);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }


}