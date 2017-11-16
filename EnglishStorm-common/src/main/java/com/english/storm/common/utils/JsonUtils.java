package com.english.storm.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonUtils {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 将对象转换成json字符串。
     * <p>Title: pojoToJson</p>
     * <p>Description: </p>
     *
     * @param data
     * @return
     */
    public static String objectToJson(Object data) {
        String string = null;
        try {
            string = MAPPER.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string;
    }

    /**
     *
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */

    /**
     * 将json结果集转化为对象
     *
     * @param jsonData json数据
     * @param beanType
     * @param <T>      clazz对象中的object类型
     * @return
     */
    public static <T> T jsonToObject(String jsonData, Class<T> beanType) throws IOException {
        T t = MAPPER.readValue(jsonData, beanType);
        return t;
    }

    /**
     * 将json数据转换成pojo对象list
     * <p>Title: jsonToList</p>
     * <p>Description: </p>
     *
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) throws IOException {
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        List<T> list = MAPPER.readValue(jsonData, javaType);
        return list;
    }






}
