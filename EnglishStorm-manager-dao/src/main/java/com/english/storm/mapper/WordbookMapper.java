package com.english.storm.mapper;

import com.english.storm.pojo.Wordbook;
import com.english.storm.pojo.WordbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordbookMapper {
    int countByExample(WordbookExample example);

    int deleteByExample(WordbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wordbook record);

    int insertSelective(Wordbook record);

    List<Wordbook> selectByExample(WordbookExample example);

    Wordbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wordbook record, @Param("example") WordbookExample example);

    int updateByExample(@Param("record") Wordbook record, @Param("example") WordbookExample example);

    int updateByPrimaryKeySelective(Wordbook record);

    int updateByPrimaryKey(Wordbook record);
}