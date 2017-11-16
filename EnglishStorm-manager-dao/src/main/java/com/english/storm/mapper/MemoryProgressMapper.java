package com.english.storm.mapper;

import com.english.storm.pojo.MemoryProgress;
import com.english.storm.pojo.MemoryProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryProgressMapper {
    int countByExample(MemoryProgressExample example);

    int deleteByExample(MemoryProgressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemoryProgress record);

    int insertSelective(MemoryProgress record);

    List<MemoryProgress> selectByExample(MemoryProgressExample example);

    MemoryProgress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemoryProgress record, @Param("example") MemoryProgressExample example);

    int updateByExample(@Param("record") MemoryProgress record, @Param("example") MemoryProgressExample example);

    int updateByPrimaryKeySelective(MemoryProgress record);

    int updateByPrimaryKey(MemoryProgress record);
}