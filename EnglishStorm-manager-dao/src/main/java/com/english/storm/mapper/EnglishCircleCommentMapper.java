package com.english.storm.mapper;

import com.english.storm.pojo.EnglishCircleComment;
import com.english.storm.pojo.EnglishCircleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnglishCircleCommentMapper {
    int countByExample(EnglishCircleCommentExample example);

    int deleteByExample(EnglishCircleCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(EnglishCircleComment record);

    int insertSelective(EnglishCircleComment record);

    List<EnglishCircleComment> selectByExample(EnglishCircleCommentExample example);

    EnglishCircleComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EnglishCircleComment record, @Param("example") EnglishCircleCommentExample example);

    int updateByExample(@Param("record") EnglishCircleComment record, @Param("example") EnglishCircleCommentExample example);

    int updateByPrimaryKeySelective(EnglishCircleComment record);

    int updateByPrimaryKey(EnglishCircleComment record);
}