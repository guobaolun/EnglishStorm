package com.english.storm.service.utils;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.common.utils.JsonUtils;
import com.english.storm.dao.JedisClient;
import com.english.storm.dao.impl.JedisClientPool;
import com.english.storm.entity.User;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @author guobaolun
 * @since 2017/12/7 17:41.
 */
public class CheckUtils {


    public static User checkToken(String token) throws IOException {
        JedisClient jedisClient = new JedisClientPool();
        String userInfoStr = jedisClient.get(token);
        if (TextUtils.isEmpty(userInfoStr)) {
            return null;
        }

        User user = JsonUtils.jsonToObject(userInfoStr, User.class);
        return  user;
    }
}
