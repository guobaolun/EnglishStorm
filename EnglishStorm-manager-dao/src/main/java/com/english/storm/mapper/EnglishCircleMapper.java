package com.english.storm.mapper;

import com.english.storm.pojo.EnglishCircle;
import com.english.storm.pojo.EnglishCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnglishCircleMapper {
    int countByExample(EnglishCircleExample example);

    int deleteByExample(EnglishCircleExample example);

    int deleteByPrimaryKey(String id);

    int insert(EnglishCircle record);

    int insertSelective(EnglishCircle record);

    List<EnglishCircle> selectByExample(EnglishCircleExample example);

    EnglishCircle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EnglishCircle record, @Param("example") EnglishCircleExample example);

    int updateByExample(@Param("record") EnglishCircle record, @Param("example") EnglishCircleExample example);

    int updateByPrimaryKeySelective(EnglishCircle record);

    int updateByPrimaryKey(EnglishCircle record);
}