package com.english.storm.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author guobaolun
 */
public class CommonUtils {


    private static final String PHONE_REGEX ="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
    /**
     * 判断是否为手机号,正确返回true 否则返回false
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(String mobiles){
        Pattern p = Pattern.compile(PHONE_REGEX);
        Matcher m = p.matcher(mobiles);
        return m.matches();

    }



}
