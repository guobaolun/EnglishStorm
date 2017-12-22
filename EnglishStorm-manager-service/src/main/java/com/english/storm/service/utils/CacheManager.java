package com.english.storm.service.utils;

import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.entity.User;
import com.english.storm.modle.UserResponse;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author guobaolun
 * @since 2017/12/7 17:59.
 */
@Component
public class CacheManager {


    @Autowired
    private JedisClient jedisClient;


    @Value("${REDIS_SESSION_EXPIRE}")
    private Integer redisSecond;


    /**
     * 缓存在redis
     */
    public void cacheUser(User user, String token) {
        user.setPassword(null);
        jedisClient.set(token, JsonUtils.objectToJson(user), redisSecond);
    }


    public User getCacheUser(String token) throws IOException {
        String userInfoStr = jedisClient.get(token);
        if (TextUtils.isEmpty(userInfoStr)) {
            return null;
        }

        User user = JsonUtils.jsonToObject(userInfoStr, User.class);
        return user;
    }


}
