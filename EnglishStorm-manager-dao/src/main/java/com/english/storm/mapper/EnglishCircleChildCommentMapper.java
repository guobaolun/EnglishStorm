package com.english.storm.mapper;

import com.english.storm.pojo.EnglishCircleChildComment;
import com.english.storm.pojo.EnglishCircleChildCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnglishCircleChildCommentMapper {
    int countByExample(EnglishCircleChildCommentExample example);

    int deleteByExample(EnglishCircleChildCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(EnglishCircleChildComment record);

    int insertSelective(EnglishCircleChildComment record);

    List<EnglishCircleChildComment> selectByExample(EnglishCircleChildCommentExample example);

    EnglishCircleChildComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EnglishCircleChildComment record, @Param("example") EnglishCircleChildCommentExample example);

    int updateByExample(@Param("record") EnglishCircleChildComment record, @Param("example") EnglishCircleChildCommentExample example);

    int updateByPrimaryKeySelective(EnglishCircleChildComment record);

    int updateByPrimaryKey(EnglishCircleChildComment record);
}