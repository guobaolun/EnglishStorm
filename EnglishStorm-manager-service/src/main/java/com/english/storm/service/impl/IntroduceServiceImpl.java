package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.common.utils.UserManager;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.UserResponse;
import com.english.storm.mapper.UserMapper;
import com.english.storm.pojo.User;
import com.english.storm.pojo.UserExample;
import com.english.storm.service.IntroduceService;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author guobaolun
 * 用户个人信息个人简介
 */
@Service
public class IntroduceServiceImpl implements IntroduceService {

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
	public EnglishStormResult updateIntroduce(String token, String introduce) throws IOException {


		String userInfoStr = jedisClient.get(token);

		if (TextUtils.isEmpty(userInfoStr)) {
			return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
		}

		User user = JsonUtils.jsonToObject(userInfoStr, User.class);

		user.setIntroduce(introduce);


		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(user.getUserId());
		int updateCount = userMapper.updateByExampleSelective(user,example);

		//修改数据失败
		if (updateCount == UPDATE_ERROR) {
			return EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
		}

		//缓存在redis
		jedisClient.set(token, JsonUtils.objectToJson(user),redisSecond);

		UserResponse userResponse = manager.getUserResponse(user, token);


		return EnglishStormResult.ok(userResponse);


	}
}
