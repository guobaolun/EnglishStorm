package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.CookieUtils;
import com.english.storm.mapper.AdministratorMapper;
import com.english.storm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdministratorMapper userMapper;

//	@Autowired
//	private JedisClient jedisClient;
//
//	@Value("${REDIS_SESSION_KEY}")
//	private String REDIS_SESSION_KEY;
//	@Value("${REDIS_SESSION_EXPIRE}")
//	private Integer REDIS_SESSION_EXPIRE;

	private static String ES_TOKEN = "ES_TOKEN";
	
	@Override
	public EnglishStormResult login(String userId, String password, HttpServletRequest request, HttpServletResponse response) {

		//判断 用户名 是否为空
//		if (StringUtils.isBlank(userId)) {
//			return EnglishStormResult.build(EnglishStormResult.Status.ERROR_5001);
//		}
//
//		//判断 密码 是否为空
//		if(StringUtils.isBlank(password)){
//			return EnglishStormResult.build(EnglishStormResult.Status.ERROR_5002);
//		}
//
//		Administrator user = userMapper.selectByPrimaryKey(userId);
//
//
//		//判断 密码 是否正确
//		if (user == null || !user.getPassword().equals(password)){
//			return EnglishStormResult.build(EnglishStormResult.Status.ERROR_5004);
//		}

		//生成token
		UUID uuid = UUID.randomUUID();
		String token = uuid.toString();


		//把用户信息写入redis 把用户的密码清空，为了安全。
//		user.setPassword(null);
//		jedisClient.set(REDIS_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
//		jedisClient.expire(REDIS_SESSION_KEY + ":" + token, REDIS_SESSION_EXPIRE);

		//把token写入cookie
		CookieUtils.setCookie(request, response, ES_TOKEN, token);

		return EnglishStormResult.ok(token);
	}

}
