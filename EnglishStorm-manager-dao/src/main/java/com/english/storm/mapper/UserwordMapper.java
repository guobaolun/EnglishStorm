package com.english.storm.mapper;

import com.english.storm.pojo.Userword;
import com.english.storm.pojo.UserwordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserwordMapper {
    int countByExample(UserwordExample example);

    int deleteByExample(UserwordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userword record);

    int insertSelective(Userword record);

    List<Userword> selectByExample(UserwordExample example);

    Userword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userword record, @Param("example") UserwordExample example);

    int updateByExample(@Param("record") Userword record, @Param("example") UserwordExample example);

    int updateByPrimaryKeySelective(Userword record);

    int updateByPrimaryKey(Userword record);
}