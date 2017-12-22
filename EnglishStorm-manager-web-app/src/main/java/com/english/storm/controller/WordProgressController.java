package com.english.storm.controller;


import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.IWordProgressService;
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
@RequestMapping("/storm/wordProgress")
public class WordProgressController {



    @Autowired
    private IWordProgressService wordProgressService;



    @RequestMapping(value = "/getReciteWordList", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getReciteWordList(String token) {
        EnglishStormResult result;
        try {
            result = wordProgressService.findReciteWordList(token);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }



    @RequestMapping(value = "/getReciteWordCount", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult getReciteWordCount(String token) {
        EnglishStormResult result;
        try {
            result = wordProgressService.getReciteWordCount(token);
        } catch (Exception e) {
            result = EnglishStormResult.serviceException(e);
        }
        return result;
    }
}

