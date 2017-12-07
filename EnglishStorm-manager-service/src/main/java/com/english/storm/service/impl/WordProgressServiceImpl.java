package com.english.storm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.WordProgress;
import com.english.storm.mapper.WordProgressMapper;
import com.english.storm.service.IWordProgressService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class WordProgressServiceImpl extends ServiceImpl<WordProgressMapper, WordProgress> implements IWordProgressService {


    @Override
    public EnglishStormResult addProgress(String token, String word) throws IOException {
//        WordProgress wordProgress = new WordProgress();
//        wordProgress.setGmtCreate(new Date());
//        wordProgress.setGmtModified(new Date());
//        wordProgress.setUserId(userId);
//        wordProgress.setWord(word);
//        wordProgress.setLastReciteTime(new Date());



        return EnglishStormResult.ok();
    }


    @Override
    public EnglishStormResult getProgressList(String token, String word) throws IOException {
        return null;
    }
}
