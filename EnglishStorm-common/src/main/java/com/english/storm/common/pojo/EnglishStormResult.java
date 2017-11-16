package com.english.storm.common.pojo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class EnglishStormResult {


    public enum Status {
        /**
         * 错误类型枚举
         */
//        SERVER_ERROR {@Override public String getMessage(){return "服务器出错";} @Override public int getCode(){return 5000;}},
//        ERROR_5001 {@Override public String getMessage(){return "用户名不能为空";} @Override public int getCode(){return 5001;}},
//        ERROR_5002 {@Override public String getMessage(){return "密码不能为空";} @Override public int getCode(){return 5002;}},
//        ERROR_5003 {@Override public String getMessage(){return "用户不存在";} @Override public int getCode(){return 5003;}},
//        ERROR_5004 {@Override public String getMessage(){return "用户名或密码错误";} @Override public int getCode(){return 5004;}},
//        ERROR_5005 {@Override public String getMessage(){return "手机号不正确";} @Override public int getCode(){return 5005;}},
//        ERROR_5006 {@Override public String getMessage(){return "手机号已被注册";} @Override public int getCode(){return 5006;}},
//        ERROR_5007 {@Override public String getMessage(){return "验证码错误";} @Override public int getCode(){return 5007;}},
//        ERROR_5008 {@Override public String getMessage(){return "token失效";} @Override public int getCode(){return 5008;}},
//        ERROR_5009 {@Override public String getMessage(){return "字符串长度超出范围";} @Override public int getCode(){return 5009;}},
//        ERROR_5010 {@Override public String getMessage(){return "参数值错误";} @Override public int getCode(){return 5010;}},
//        ERROR_5011 {@Override public String getMessage(){return "插入数据出错";} @Override public int getCode(){return 5011;}},
//        ERROR_5012 {@Override public String getMessage(){return "文件不能为空";} @Override public int getCode(){return 5012;}},
//        ERROR_5013 {@Override public String getMessage(){return "字段内容不能为空";} @Override public int getCode(){return 5013;}},
//        ERROR_5014 {@Override public String getMessage(){return "参数错误";} @Override public int getCode(){return 5014;}},

        SERVER_ERROR {@Override public String getMessage(){return "服务器出错";} @Override public int getCode(){return 5000;}},
        ERROR_50001 {@Override public String getMessage(){return "token失效";} @Override public int getCode(){return 5008;}},
        ERROR_50002 {@Override public String getMessage(){return "参数错误";} @Override public int getCode(){return 5014;}},
        ERROR_50003 {@Override public String getMessage(){return "用户不存在";} @Override public int getCode(){return 5003;}},
        ERROR_50004 {@Override public String getMessage(){return "用户名或密码错误";} @Override public int getCode(){return 5004;}},

        ERROR_50005 {@Override public String getMessage(){return "手机号不正确";} @Override public int getCode(){return 5005;}},
        ERROR_50006 {@Override public String getMessage(){return "手机号已被注册";} @Override public int getCode(){return 5006;}},
        ERROR_50007 {@Override public String getMessage(){return "验证码错误";} @Override public int getCode(){return 5007;}},


        ;

        public abstract String getMessage();

        public abstract int getCode();
    }

    /**
     *定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;


    public static EnglishStormResult ok(Object data) {
        return new EnglishStormResult(data);
    }

    public static EnglishStormResult ok() {
        return new EnglishStormResult(null);
    }


    public static EnglishStormResult build(Integer status, String msg, Object data) {
        return new EnglishStormResult(status, msg, data);
    }

    public static EnglishStormResult build(Integer status, String msg) {
        return new EnglishStormResult(status, msg, null);
    }


    public static EnglishStormResult build(Status status, Object data) {
        return new EnglishStormResult(status.getCode(), status.getMessage(), data);
    }

    public static EnglishStormResult build(Status status) {
        return new EnglishStormResult(status.getCode(), status.getMessage(), null);
    }


    public static EnglishStormResult serviceException(Exception e){
//        return build(EnglishStormResult.Status.SERVER_ERROR);

        e.printStackTrace();
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        String str = sw.toString();
        return  build(5000,str );
    }

    private EnglishStormResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private EnglishStormResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getCode() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为Result对象
     *
     * @param jsonData json数据
     * @param clazz    Result中的object类型
     * @return EnglishStormResult
     */
    public static EnglishStormResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, EnglishStormResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isObject()) {
                obj = MAPPER.readValue(data.traverse(), clazz);
            } else if (data.isTextual()) {
                obj = MAPPER.readValue(data.asText(), clazz);
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return build(Status.SERVER_ERROR);
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json json
     * @return EnglishStormResult
     */
    public static EnglishStormResult format(String json) {
        try {
            return MAPPER.readValue(json, EnglishStormResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return build(Status.SERVER_ERROR);
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz    集合中的类型
     * @return EnglishStormResult
     */
    public static EnglishStormResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return build(Status.SERVER_ERROR);
        }
    }

}
