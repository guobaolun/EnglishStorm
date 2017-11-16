package com.english.storm.model;

/**
 * Created by Administrator on 2017/4/3.
 */
public class DataTablesSearch {

    private String value;       //全局的搜索条件


    private boolean regex;      //如果为 true代表全局搜索的值是作为正则表达式处理

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isRegex() {
        return regex;
    }

    public void setRegex(boolean regex) {
        this.regex = regex;
    }
}
