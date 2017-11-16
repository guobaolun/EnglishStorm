package com.english.storm.mapper;

import com.english.storm.pojo.LoginInfo;
import com.english.storm.pojo.LoginInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginInfoMapper {
    int countByExample(LoginInfoExample example);

    int deleteByExample(LoginInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginInfo record);

    int insertSelective(LoginInfo record);

    List<LoginInfo> selectByExample(LoginInfoExample example);

    LoginInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginInfo record, @Param("example") LoginInfoExample example);

    int updateByExample(@Param("record") LoginInfo record, @Param("example") LoginInfoExample example);

    int updateByPrimaryKeySelective(LoginInfo record);

    int updateByPrimaryKey(LoginInfo record);
}