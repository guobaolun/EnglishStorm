package com.english.storm.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.CommonUtils;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.User;
import com.english.storm.mapper.UserMapper;
import com.english.storm.modle.UserResponse;
import com.english.storm.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.english.storm.service.manager.UserManager;
import com.english.storm.service.utils.CheckUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_SESSION_EXPIRE}")
    private Integer redisSecond;

    @Autowired
    private UserManager userManager;

    private static final int CURRENT = 0;
//	private static final int hometown = 1;

    @Override
    public EnglishStormResult findUser(String userId, String password) {


        User user = new User();

        user = user.selectOne(new EntityWrapper<User>().eq("user_id", userId).eq("password", password));

        EnglishStormResult result = checkLogin(password, user);

        //判断 用户名 是否为空
        if (result != null) {
            return result;
        }

        user.setLastTime(new Date(System.currentTimeMillis()));
        user.updateById();
        user.setPassword(null);

        return EnglishStormResult.ok(cache(user,UUID.randomUUID().toString()));
    }




    @Override
    public EnglishStormResult addUser(String userId, String password, String checkCode, String nickname, String country, String province, String city) {

        EnglishStormResult result = checkRegister(userId, checkCode);

        if (result != null) {
            return result;
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        nickname = "user" + formatter.format(new Date());

        Date date = new Date();
        User user = new User();
        user.setGmtCreate(date);
        user.setGmtModified(date);
        user.setUserId(userId);
        user.setPassword(password);
        user.setNickname(nickname);
        user.setLv(0);
        user.setLastTime(date);
        user.setPermission(0);
        user.setCurrentCountry(country);
        user.setCurrentProvince(province);
        user.setCurrentCity(city);
        user.setHometownCountry(country);
        user.setHometownProvince(province);
        user.setHometownCity(city);

        boolean isOk = user.insert();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,UUID.randomUUID().toString()));
    }

    @Override
    public EnglishStormResult updateBirthday(String token, long birthday) throws IOException {

        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setBirthday(new Date(birthday));
        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }



    @Override
    public EnglishStormResult updateDegree( String token, String degree) throws IOException {

        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setDegree(degree);
        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }



    @Override
    public EnglishStormResult updateIntroduce(String token, String introduce) throws IOException {

        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setIntroduce(introduce);
        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }




    @Override
    public EnglishStormResult updateNickname(String token, String nickname) throws IOException {
        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setNickname(nickname);

        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }



    @Override
    public EnglishStormResult updatePortrait(String token, String portrait) throws IOException {
        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setPortrait(portrait);

        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }


    @Override
    public EnglishStormResult updateSchool(String token, String school) throws IOException {
        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setSchool(school);

        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }


    @Override
    public EnglishStormResult updateSex(String token, int sex) throws IOException {
        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setIsSex(0);

        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }


    @Override
    public EnglishStormResult updateSpeciality(String token, String speciality) throws IOException {
        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }

        user.setSpeciality(speciality);
        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }




    @Override
    public EnglishStormResult updateLocation(String token, int type, String country, String province, String city, String area) throws IOException {
        User user = CheckUtils.checkToken(token);
        if (user == null) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }


        if (type == CURRENT){
            user.setCurrentCountry(country);
            user.setCurrentProvince(province);
            user.setCurrentCity(city);
            user.setCurrentArea(area);
        }else{
            user.setHometownCountry(country);
            user.setHometownProvince(province);
            user.setHometownCity(city);
            user.setHometownArea(area);
        }

        boolean isOk = user.updateById();

        if (!isOk) {
            return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
        }

        return EnglishStormResult.ok(cache(user,token));
    }


    private EnglishStormResult checkLogin(String password, User user) {

        //判断帐号是否存在TextUtils.isEmpty
        if (user == null || TextUtils.isEmpty(user.getUserId())) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50003);
        }

        if (!user.getPassword().equals(password)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50004);
        }
        return null;
    }




    private EnglishStormResult checkRegister(String userId, String checkCode) {

        //判断验证码
        if (!"0000".equals(checkCode)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50007);
        }

        //判断是否为手机号
        if (!CommonUtils.isMobileNO(userId)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50005);
        }

        User user = new User();

        user = user.selectOne(new EntityWrapper<User>().eq("user_id", userId));

        //判断帐号是否已被注册
        if (user != null && !TextUtils.isEmpty(user.getUserId())) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50006);
        }
        return null;
    }


    /**
     * 缓存在redis
     */
    private UserResponse cache(User user,String token){
        user.setPassword(null);
        jedisClient.set(token, JsonUtils.objectToJson(user),redisSecond);
        return userManager.getUserResponse(user, token);
    }

}
