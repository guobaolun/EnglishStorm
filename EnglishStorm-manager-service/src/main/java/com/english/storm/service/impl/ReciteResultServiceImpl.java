package com.english.storm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.entity.ReciteResult;
import com.english.storm.entity.User;
import com.english.storm.entity.WordProgress;
import com.english.storm.mapper.ReciteResultMapper;
import com.english.storm.service.IReciteResultService;
import com.english.storm.service.utils.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class ReciteResultServiceImpl extends ServiceImpl<ReciteResultMapper, ReciteResult> implements IReciteResultService {

    @Autowired
    private CacheManager cacheManager;

    @Override
    public EnglishStormResult addReciteResult(String token, String resultData) throws IOException {

        User user = cacheManager.getCacheUser(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        List<ReciteResult> reciteResultList = JsonUtils.jsonToList(resultData, ReciteResult.class);

        Date data = new Date();
        for (ReciteResult result : reciteResultList) {

            Wrapper wrapper = new EntityWrapper<WordProgress>().eq("user_id", user.getUserId()).eq("word", result.getWord());

            WordProgress wordProgress = new WordProgress().selectOne(wrapper);


            result.setGmtCreate(data);
            result.setGmtModified(data);
            result.setUserId(user.getUserId());


            int isRight;
            if (result.getWord().equals(result.getInputWord())) {
                isRight = 0;
            } else {
                isRight = 1;
            }

            int increase;
            if (isRight == 0) {
                if (result.getInputTime() < 20) {
                    increase = 10;
                } else if (result.getInputTime() < 30) {
                    increase = 9;
                } else {
                    increase = 8;
                }
            } else {
                if (wordProgress == null){
                    increase = 0;
                }else{
                    increase = -1;
                }
            }
            result.setIncrease(increase);
            result.setIsRight(isRight);
            result.insert();



            if (wordProgress != null) {
                wordProgress.setWord(result.getWord());
                wordProgress.setLastReciteTime(data);
                wordProgress.setProgress(wordProgress.getProgress()+increase);
                wordProgress.update(wrapper);
            } else {
                wordProgress = new WordProgress();
                wordProgress.setGmtCreate(data);
                wordProgress.setGmtModified(data);
                wordProgress.setUserId(user.getUserId());
                wordProgress.setWord(result.getWord());
                wordProgress.setLastReciteTime(data);
                wordProgress.setProgress(increase);
                wordProgress.insert();
            }


            wordProgress.update(wrapper);

        }


        return EnglishStormResult.ok();
    }
}
//ReciteResult
