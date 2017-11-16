package com.english.storm.service.impl;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.dao.JedisClient;
import com.english.storm.service.QiniuService;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author guobaolun
 * 获取七牛上传令牌
 */
@Service
public class QiniuServiceImpl implements QiniuService {




    @Value("${ACCESS_KEY}")
    private String ACCESS_KEY;

    @Value("${SECRET_KEY}")
    private String SECRET_KEY;

    @Value("${BUCKET}")
    private String BUCKET;


    @Autowired
    private JedisClient jedisClient;




    @Override
    public EnglishStormResult getToken(String token) {
        String userInfoStr = jedisClient.get(token);

        if (TextUtils.isEmpty(userInfoStr)) {
            return EnglishStormResult.build(EnglishStormResult.Status.ERROR_50001);
        }



        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

        StringMap putPolicy = new StringMap();
        putPolicy
                .put("fsizeMin", 1024)                     //文件大小最小为 1KB
                .put("fsizeLimit", 1024 * 1024 * 500)       //文件大小最大为 500M
                .put("deadline", System.currentTimeMillis() + 19000);       //一般建议设置为上传开始时间 + 3600
//                    .putNotNull("callbackUrl", "http://22e7845a.ngrok.io/WebProject/callback")
//                    .putNotNull("callbackHost","http://22e7845a.ngrok.io")
//                    .putNotNull("callbackBodyType", "application/json")       //一般建议设置为上传开始时间 + 3600
//                    .putNotNull("callbackBody", "{\"currTime\":\"$(x:currTime)\", \"content\":\"$(x:content)\", \"key\":\"$(key)\"}")
//                .putNotEmpty("mimeType", "image/jpg");     //文件类型为jpg图片, 所有图片 设置为 image/*

        String upToken = auth.uploadToken(BUCKET, null, System.currentTimeMillis() + 900, putPolicy);

        return EnglishStormResult.ok(upToken);

    }

}
