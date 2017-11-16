package com.english.storm.mapper;

import com.english.storm.pojo.FindReciteWordCommen;
import com.english.storm.pojo.FindReciteWordCommenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FindReciteWordCommenMapper {
    int countByExample(FindReciteWordCommenExample example);

    int deleteByExample(FindReciteWordCommenExample example);

    int deleteByPrimaryKey(String id);

    int insert(FindReciteWordCommen record);

    int insertSelective(FindReciteWordCommen record);

    List<FindReciteWordCommen> selectByExample(FindReciteWordCommenExample example);

    FindReciteWordCommen selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FindReciteWordCommen record, @Param("example") FindReciteWordCommenExample example);

    int updateByExample(@Param("record") FindReciteWordCommen record, @Param("example") FindReciteWordCommenExample example);

    int updateByPrimaryKeySelective(FindReciteWordCommen record);

    int updateByPrimaryKey(FindReciteWordCommen record);
}