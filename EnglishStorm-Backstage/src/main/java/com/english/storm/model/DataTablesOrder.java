package com.english.storm.model;

/**
 * Created by Administrator on 2017/4/3.
 */
public class DataTablesOrder {


    private int column;     //那些列是需要排序的。 i是一个数组索引，对应的是 columns配置的数组，从0开始
    private String dir;      //列排序的方式， desc 降序 asc升序

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
