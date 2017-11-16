package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.common.utils.UserManager;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.UserResponse;
import com.english.storm.mapper.UserMapper;
import com.english.storm.pojo.User;
import com.english.storm.service.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author guobaolun
 * 用户登录
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserManager manager;


	@Autowired
	private JedisClient jedisClient;

	@Value("${REDIS_SESSION_EXPIRE}")
	private Integer redisSecond;



	@Override
	public EnglishStormResult getUser(String userId, String password){


		User user = userMapper.selectByPrimaryKey(userId);

		EnglishStormResult result = check(password,user);

		//判断 用户名 是否为空
		if (result != null) {
			return result;
		}

		user.setLastTime(System.currentTimeMillis());
		userMapper.updateByPrimaryKey(user);
		user.setPassword(null);

		UserResponse userResponse = manager.getUserResponse(user, UUID.randomUUID().toString());

		//缓存在redis
		jedisClient.set(userResponse.getToken(), JsonUtils.objectToJson(user),redisSecond);

		return EnglishStormResult.ok(userResponse);
	}


	private EnglishStormResult check(String password,User user) {
		if (!user.getPassword().equals(password)) {
			return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50004);
		}

		//判断帐号是否存在
		if (StringUtils.isBlank(user.getUserId())) {
			return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50003);
		}
		return null;
	}


}
