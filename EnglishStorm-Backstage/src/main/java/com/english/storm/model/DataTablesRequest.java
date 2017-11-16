package com.english.storm.model;

/**
 * Created by Kuo on 2016/11/10.
 */
public class DataTablesRequest {
//    private ArrayList<DataTablesColumns> columns ;
//    private ArrayList<DataTablesOrder> order ;
//    private DataTablesSearch search ;
    private int draw;                                   //第几次请求
    private int start;          //第一条数据的起始位置，比如0代表第一条数据
    private int length;         //每页显示的条数

//    public ArrayList<DataTablesColumns> getColumns() {
//        return columns;
//    }
//
//    public void setColumns(ArrayList<DataTablesColumns> columns) {
//        this.columns = columns;
//    }
//
//    public ArrayList<DataTablesOrder> getOrder() {
//        return order;
//    }
//
//    public void setOrder(ArrayList<DataTablesOrder> order) {
//        this.order = order;
//    }
//
//    public DataTablesSearch getSearch() {
//        return search;
//    }
//
//    public void setSearch(DataTablesSearch search) {
//        this.search = search;
//    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
