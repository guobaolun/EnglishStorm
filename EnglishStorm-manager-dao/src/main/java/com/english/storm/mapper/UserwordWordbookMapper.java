package com.english.storm.mapper;

import com.english.storm.pojo.UserwordWordbook;
import com.english.storm.pojo.UserwordWordbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserwordWordbookMapper {
    int countByExample(UserwordWordbookExample example);

    int deleteByExample(UserwordWordbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserwordWordbook record);

    int insertSelective(UserwordWordbook record);

    List<UserwordWordbook> selectByExample(UserwordWordbookExample example);

    UserwordWordbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserwordWordbook record, @Param("example") UserwordWordbookExample example);

    int updateByExample(@Param("record") UserwordWordbook record, @Param("example") UserwordWordbookExample example);

    int updateByPrimaryKeySelective(UserwordWordbook record);

    int updateByPrimaryKey(UserwordWordbook record);
}