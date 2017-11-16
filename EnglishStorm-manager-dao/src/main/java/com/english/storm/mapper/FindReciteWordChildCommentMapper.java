package com.english.storm.mapper;

import com.english.storm.pojo.FindReciteWordChildComment;
import com.english.storm.pojo.FindReciteWordChildCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FindReciteWordChildCommentMapper {
    int countByExample(FindReciteWordChildCommentExample example);

    int deleteByExample(FindReciteWordChildCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(FindReciteWordChildComment record);

    int insertSelective(FindReciteWordChildComment record);

    List<FindReciteWordChildComment> selectByExample(FindReciteWordChildCommentExample example);

    FindReciteWordChildComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FindReciteWordChildComment record, @Param("example") FindReciteWordChildCommentExample example);

    int updateByExample(@Param("record") FindReciteWordChildComment record, @Param("example") FindReciteWordChildCommentExample example);

    int updateByPrimaryKeySelective(FindReciteWordChildComment record);

    int updateByPrimaryKey(FindReciteWordChildComment record);
}