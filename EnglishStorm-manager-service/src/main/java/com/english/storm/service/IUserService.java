package com.english.storm.service;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.entity.User;
import com.baomidou.mybatisplus.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
public interface IUserService extends IService<User> {

    EnglishStormResult findUser(String userId, String password) ;
    EnglishStormResult addUser(String userId, String password, String checkCode, String nickname, String country, String province, String city);
    EnglishStormResult updateBirthday(String token, long birthday) throws IOException;
    EnglishStormResult updateDegree(String token, String degree) throws IOException;
    EnglishStormResult updateIntroduce(String token, String introduce) throws IOException;
    EnglishStormResult updateNickname(String token, String nickname) throws IOException;
    EnglishStormResult updatePortrait(String token, String portrait) throws IOException;
    EnglishStormResult updateSchool(String token, String school) throws IOException;
    EnglishStormResult updateSex(String token, int sex) throws IOException;
    EnglishStormResult updateSpeciality(String token, String speciality) throws IOException;
    EnglishStormResult updateLocation(String token, int type, String country, String province, String city, String area) throws IOException;

}
