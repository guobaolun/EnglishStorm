package com.english.storm.mapper;

import com.english.storm.entity.WordProgress;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-08
 */
public interface WordProgressMapper extends BaseMapper<WordProgress> {
        List<String> findReciteWord(int selectCount);

}
