package com.english.storm.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {

    /**
     * 获取异常的堆栈信息
     *
     * @param t Throwable
     * @return s
     */
    public static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();

        try (PrintWriter pw = new PrintWriter(sw)) {
            t.printStackTrace(pw);
            return sw.toString();
        }
    }
}
