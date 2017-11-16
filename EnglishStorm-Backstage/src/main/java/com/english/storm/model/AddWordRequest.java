package com.english.storm.model;

import java.util.ArrayList;

/**
 * Created by Kuo on 2017/3/28.
 */
public class AddWordRequest {

    private String token;
    private ArrayList<WordBean> wordlist;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ArrayList<WordBean> getWordlist() {
        return wordlist;
    }

    public void setWordlist(ArrayList<WordBean> wordlist) {
        this.wordlist = wordlist;
    }
}
