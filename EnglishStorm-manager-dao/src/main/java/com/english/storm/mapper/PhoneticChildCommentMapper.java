package com.english.storm.mapper;

import com.english.storm.pojo.PhoneticChildComment;
import com.english.storm.pojo.PhoneticChildCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneticChildCommentMapper {
    int countByExample(PhoneticChildCommentExample example);

    int deleteByExample(PhoneticChildCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(PhoneticChildComment record);

    int insertSelective(PhoneticChildComment record);

    List<PhoneticChildComment> selectByExample(PhoneticChildCommentExample example);

    PhoneticChildComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PhoneticChildComment record, @Param("example") PhoneticChildCommentExample example);

    int updateByExample(@Param("record") PhoneticChildComment record, @Param("example") PhoneticChildCommentExample example);

    int updateByPrimaryKeySelective(PhoneticChildComment record);

    int updateByPrimaryKey(PhoneticChildComment record);
}