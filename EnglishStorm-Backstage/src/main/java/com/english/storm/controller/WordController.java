package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.model.AddWordRequest;
import com.english.storm.model.DataTablesRequest;
import com.english.storm.model.WordBean;
import com.english.storm.model.WordResult;
import com.english.storm.pojo.Word;
import com.english.storm.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WordController {

    @Autowired
    private WordService wordService;

    @RequestMapping(value = "/word/item/add/list", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult addList(AddWordRequest request) {
        EnglishStormResult result;
        try {
            result = wordService.addWordList(request.getWordlist());
        } catch (Exception e) {
            result = EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return result;
    }

    @RequestMapping(value = "/word/item/add", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult add(WordBean wordBean) {
        EnglishStormResult result;
        try {
            result = wordService.addWord(wordBean);
        } catch (Exception e) {
//			result = EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR.getCode(),EnglishStormResult.Status.SERVER_ERROR.getMessage());
            result = EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return result;
    }



    @RequestMapping(value = "/item/word/getList", method = RequestMethod.POST)
    @ResponseBody
    public WordResult getList(DataTablesRequest request) {
        WordResult result = new WordResult();
        try {
            result = wordService.getWordList(request);

        } catch (Exception e) {

        }
        return result;
    }



    @RequestMapping(value = "/item/word/upWord", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult upWord(Word word) {
        EnglishStormResult result;
        try {
            result = wordService.upWord(word);
        } catch (Exception e) {
			result = EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return result;
    }


    @RequestMapping(value = "/item/word/deleteWord", method = RequestMethod.POST)
    @ResponseBody
    public EnglishStormResult deleteWord(Word word) {
        EnglishStormResult result;
        try {
            result = wordService.deleteWord(word);
        } catch (Exception e) {
            result = EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return result;
    }

}