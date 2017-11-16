package com.english.storm.mapper;

import com.english.storm.pojo.PhoneticComment;
import com.english.storm.pojo.PhoneticCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneticCommentMapper {
    int countByExample(PhoneticCommentExample example);

    int deleteByExample(PhoneticCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(PhoneticComment record);

    int insertSelective(PhoneticComment record);

    List<PhoneticComment> selectByExample(PhoneticCommentExample example);

    PhoneticComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PhoneticComment record, @Param("example") PhoneticCommentExample example);

    int updateByExample(@Param("record") PhoneticComment record, @Param("example") PhoneticCommentExample example);

    int updateByPrimaryKeySelective(PhoneticComment record);

    int updateByPrimaryKey(PhoneticComment record);
}