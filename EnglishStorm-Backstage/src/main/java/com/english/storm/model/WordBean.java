package com.english.storm.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Kuo on 2017/3/28.
 */
public class WordBean {

    private String id;
    private String word;
    private String chinese;
    private String ukPhonetic;
    private String usPhonetic;
    private MultipartFile soundFile;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getUkPhonetic() {
        return ukPhonetic;
    }

    public void setUkPhonetic(String ukPhonetic) {
        this.ukPhonetic = ukPhonetic;
    }

    public String getUsPhonetic() {
        return usPhonetic;
    }

    public void setUsPhonetic(String usPhonetic) {
        this.usPhonetic = usPhonetic;
    }

    public MultipartFile getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(MultipartFile soundFile) {
        this.soundFile = soundFile;
    }
}
