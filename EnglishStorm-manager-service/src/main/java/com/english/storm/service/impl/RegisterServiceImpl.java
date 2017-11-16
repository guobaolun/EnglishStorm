package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.common.utils.MyUtils;
import com.english.storm.common.utils.UserManager;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.UserResponse;
import com.english.storm.mapper.UserMapper;
import com.english.storm.pojo.User;
import com.english.storm.service.RegisterService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author guobaolun
 * 注册
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserManager manager;

    private static final int UPDATE_ERROR = 0;

    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_SESSION_EXPIRE}")
    private Integer redisSecond;




    @Override
    public EnglishStormResult addUser(String userId, String password, String checkCode, String nickname, String country, String province, String city) {

        EnglishStormResult result = check(userId, checkCode);

        if (result != null) {
            return result;
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        nickname = "user" + formatter.format(new Date());

        long currentTimeMillis = System.currentTimeMillis();
        User user = new User();

        user.setUserId(userId);
        user.setPassword(password);
        user.setNickname(nickname);
        user.setLv(0);
        user.setCreateTime(currentTimeMillis);
        user.setLastTime(currentTimeMillis);
        user.setPermission(0);
        user.setCurrentCountry(country);
        user.setCurrentProvince(province);
        user.setCurrentCity(city);
        user.setHometownCountry(country);
        user.setHometownProvince(province);
        user.setHometownCity(city);


        int updateCount = userMapper.insert(user);

        //修改数据失败
        if (updateCount == UPDATE_ERROR) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }
        user.setPassword(null);

        UserResponse userResponse = manager.getUserResponse(user, UUID.randomUUID().toString());

        //缓存在redis
        jedisClient.set(userResponse.getToken(), JsonUtils.objectToJson(user),redisSecond);

        return EnglishStormResult.ok(userResponse);
    }


    private EnglishStormResult check(String userId, String checkCode) {

        //判断验证码
        if (!"0000".equals(checkCode)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50007);
        }


        //判断是否为手机号
        if (!MyUtils.isMobileNO(userId)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50005);
        }

        User user = userMapper.selectByPrimaryKey(userId);

        //判断帐号是否已被注册
        if (user != null && !StringUtils.isBlank(user.getUserId())) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50006);
        }
        return null;
    }


}
