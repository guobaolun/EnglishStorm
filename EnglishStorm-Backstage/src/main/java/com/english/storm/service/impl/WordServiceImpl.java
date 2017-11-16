package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.dao.JedisClient;
import com.english.storm.mapper.WordMapper;
import com.english.storm.model.DataTablesRequest;
import com.english.storm.model.WordBean;
import com.english.storm.model.WordResult;
import com.english.storm.pojo.Word;
import com.english.storm.pojo.WordExample;
import com.english.storm.service.WordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class WordServiceImpl implements WordService {

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;


    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_SESSION_KEY}")
    private String REDIS_SESSION_KEY;

    @Autowired
    private WordMapper wordMapper;

    @Override
    public EnglishStormResult addWordList(ArrayList<WordBean> wordlist) {
        for (WordBean wordBean : wordlist) {
            Word word = new Word();
            word.setChinese(wordBean.getChinese());
            word.setUkPhonetic(wordBean.getUkPhonetic());
            word.setUsPhonetic(wordBean.getUsPhonetic());
            word.setWord(word.getWord());
//            word.setSound(UploadFileUtil.uploadFile(wordBean.getSoundFile()));
                wordMapper.insert(word);
        }
        return EnglishStormResult.ok();
    }


    @Override
    public EnglishStormResult addWord(WordBean wordBean) {
        Word word = new Word();
        word.setChinese(wordBean.getChinese());
        word.setUkPhonetic(wordBean.getUkPhonetic());
        word.setUsPhonetic(wordBean.getUsPhonetic());
        word.setWord(wordBean.getWord());
//        word.setSound(UploadFileUtil.uploadFile(wordBean.getSoundFile()));

        wordMapper.insert(word);

        return EnglishStormResult.ok();
    }


    @Override
    public WordResult getWordList(DataTablesRequest request) {

        PageHelper.startPage((request.getStart() / request.getLength()) + 1, request.getLength());
        WordExample example = new WordExample();

        example.setOrderByClause("_id ASC");
//        example.setOrderByClause("_id "+request.getOrder().get(0).getDir());

        List<Word> list = wordMapper.selectByExample(example);

        PageInfo<Word> pageInfo = new PageInfo<>(list);
        pageInfo.getOrderBy();

        WordResult result = new WordResult();

        result.setDraw(request.getDraw());
        result.setRecordsFiltered(pageInfo.getTotal());
        result.setRecordsTotal(pageInfo.getTotal());
        result.setData(pageInfo.getList());
        return result;
    }

    @Override
    public EnglishStormResult upWord(Word word) {
        wordMapper.updateByPrimaryKey(word);
        return EnglishStormResult.ok();
    }

    @Override
    public EnglishStormResult deleteWord(Word word) {
        wordMapper.deleteByPrimaryKey(word.getId());
        return EnglishStormResult.ok();
    }






}
