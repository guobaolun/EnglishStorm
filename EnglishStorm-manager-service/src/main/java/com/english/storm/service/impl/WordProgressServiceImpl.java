package com.english.storm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.User;
import com.english.storm.entity.WordProgress;
import com.english.storm.mapper.WordProgressMapper;
import com.english.storm.modle.ReciteWordCountData;
import com.english.storm.modle.ReciteWordData;
import com.english.storm.service.IWordProgressService;
import com.english.storm.service.utils.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
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
public class WordProgressServiceImpl extends ServiceImpl<WordProgressMapper, WordProgress> implements IWordProgressService {

    private static final long MINUTE = 1000 * 60;
    private static final long HOUR = MINUTE * 60;
    private static final long DAY = HOUR * 24;

    private static final int MAX_WORD_COUNT = 20;

    @Autowired
    private WordProgressMapper wordProgressMapper;
    @Autowired
    private CacheManager cacheManager;


    private static final String USER_ID = "user_id";
    private static final String WORD = "word";
    private static final String PROGRESS = "progress";
    private static final String LAST_RECITE_TIME = "last_recite_time";

    @Override
    public EnglishStormResult findReciteWordList(String token) throws IOException {

        User user = cacheManager.getCacheUser(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        WordProgress wordProgress = new WordProgress();


        List<WordProgress> wordProgressList = wordProgress.selectList(getReciteWordWrapper(user.getUserId(), true));

        List<ReciteWordData> reciteWordDataList = new ArrayList<>();


        for (WordProgress progress : wordProgressList) {
            ReciteWordData wordData = new ReciteWordData();
            wordData.setWord(progress.getWord());
            wordData.setProgress(wordData.getProgress());
            reciteWordDataList.add(wordData);
        }


        if (reciteWordDataList.size() < MAX_WORD_COUNT) {
            List<String> wordList = wordProgressMapper.findReciteWord(MAX_WORD_COUNT - reciteWordDataList.size());
            for (String wordStr : wordList) {
                ReciteWordData wordData = new ReciteWordData();
                wordData.setWord(wordStr);
                wordData.setProgress(0);
                reciteWordDataList.add(wordData);
            }
        }
        return EnglishStormResult.ok(reciteWordDataList);
    }

    @Override
    public EnglishStormResult getReciteWordCount(String token) throws IOException {

        User user = cacheManager.getCacheUser(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }


        WordProgress wordProgress = new WordProgress();
        Wrapper totalWrapper = new EntityWrapper<WordProgress>().eq(USER_ID, user.getUserId());
        int totalCount = wordProgress.selectCount(totalWrapper);

        Wrapper accomplishWrapper = new EntityWrapper<WordProgress>().eq(USER_ID, user.getUserId()).eq(PROGRESS, 100);
        int accomplishCount = wordProgress.selectCount(accomplishWrapper);

        Wrapper unfinishedWrapper = new EntityWrapper<WordProgress>().eq(USER_ID, user.getUserId()).le(PROGRESS, 100);
        int unfinishedCount = wordProgress.selectCount(unfinishedWrapper);

        int reciteWordCount = wordProgress.selectCount(getReciteWordWrapper(user.getUserId(), false));


        ReciteWordCountData reciteWordCountData =  new ReciteWordCountData();

        reciteWordCountData.setTotalCount(totalCount);
        reciteWordCountData.setAccomplishCount(accomplishCount);
        reciteWordCountData.setUnfinishedCount(unfinishedCount);
        reciteWordCountData.setReciteWordCount(reciteWordCount);


        return EnglishStormResult.ok(reciteWordCountData);
    }

    private Wrapper getReciteWordWrapper(String userId, boolean isLimit) {
        long currentTime = System.currentTimeMillis();

        String last = "ORDER BY RAND() LIMIT " + MAX_WORD_COUNT;


        String sql = USER_ID + " = {0} AND (" +
                "((" + PROGRESS + " BETWEEN {1} AND {2}) AND " + LAST_RECITE_TIME + " < {3}) " +
                "OR ((" + PROGRESS + "  BETWEEN {4} AND {5}) AND " + LAST_RECITE_TIME + " < {6}) " +
                "OR ((" + PROGRESS + "  BETWEEN {7} AND {8}) AND " + LAST_RECITE_TIME + " < {9}) " +
                "OR ((" + PROGRESS + "  BETWEEN {10} AND {11}) AND " + LAST_RECITE_TIME + " < {12}) " +
                "OR ((" + PROGRESS + "  BETWEEN {13} AND {14}) AND " + LAST_RECITE_TIME + " < {15}) " +
                "OR ((" + PROGRESS + "  BETWEEN {16} AND {17}) AND " + LAST_RECITE_TIME + " < {18}) " +
                "OR ((" + PROGRESS + "  BETWEEN {19} AND {20}) AND " + LAST_RECITE_TIME + " < {21}) " +
                "OR ((" + PROGRESS + "  BETWEEN {22} AND {23}) AND " + LAST_RECITE_TIME + " < {24}) " +
                "OR ((" + PROGRESS + "  BETWEEN {25} AND {26}) AND " + LAST_RECITE_TIME + " < {27}) )";


        Wrapper entityWrapper = new EntityWrapper<WordProgress>()
                .where(sql, userId,
                        0, 10, new Date(currentTime - (MINUTE * 30)),
                        11, 20, new Date(currentTime - (HOUR * 2)),
                        21, 30, new Date(currentTime - (HOUR * 6)),
                        31, 40, new Date(currentTime - (HOUR * 12)),
                        41, 50, new Date(currentTime - DAY),
                        51, 60, new Date(currentTime - (DAY * 2)),
                        61, 70, new Date(currentTime - (DAY * 3)),
                        71, 80, new Date(currentTime - (DAY * 6)),
                        81, 90, new Date(currentTime - (DAY * 8)),
                        91, 99, new Date(currentTime - (DAY * 10))
                );
        if (isLimit) {
            entityWrapper.last(last);
        }

        return entityWrapper;
    }

}
