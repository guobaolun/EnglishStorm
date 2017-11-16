package com.english.storm.mapper;

import com.english.storm.pojo.FindReciteWord;
import com.english.storm.pojo.FindReciteWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FindReciteWordMapper {
    int countByExample(FindReciteWordExample example);

    int deleteByExample(FindReciteWordExample example);

    int deleteByPrimaryKey(String id);

    int insert(FindReciteWord record);

    int insertSelective(FindReciteWord record);

    List<FindReciteWord> selectByExample(FindReciteWordExample example);

    FindReciteWord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FindReciteWord record, @Param("example") FindReciteWordExample example);

    int updateByExample(@Param("record") FindReciteWord record, @Param("example") FindReciteWordExample example);

    int updateByPrimaryKeySelective(FindReciteWord record);

    int updateByPrimaryKey(FindReciteWord record);
}