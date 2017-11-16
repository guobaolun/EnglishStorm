package com.english.storm.model;

import com.english.storm.pojo.Word;

import java.util.List;

public class WordResult {

    private int draw;                   //表示请求次数
    private Long recordsTotal;          //总记录数
    private Long recordsFiltered;       //过滤后的总记录数
    private List<Word> data;


    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public Long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<Word> getData() {
        return data;
    }

    public void setData(List<Word> data) {
        this.data = data;
    }
}
