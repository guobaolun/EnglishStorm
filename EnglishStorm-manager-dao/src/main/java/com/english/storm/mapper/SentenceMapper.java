package com.english.storm.mapper;

import com.english.storm.pojo.Sentence;
import com.english.storm.pojo.SentenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SentenceMapper {
    int countByExample(SentenceExample example);

    int deleteByExample(SentenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sentence record);

    int insertSelective(Sentence record);

    List<Sentence> selectByExample(SentenceExample example);

    Sentence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sentence record, @Param("example") SentenceExample example);

    int updateByExample(@Param("record") Sentence record, @Param("example") SentenceExample example);

    int updateByPrimaryKeySelective(Sentence record);

    int updateByPrimaryKey(Sentence record);
}