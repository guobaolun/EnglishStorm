package com.english.storm.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {

    /**
     * 判断是否为手机号,正确返回true 否则返回false
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(String mobiles){
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();

    }



}
