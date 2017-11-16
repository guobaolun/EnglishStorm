package com.english.storm.pojo;

public class Word {
    private Integer id;

    private String word;

    private String chinese;

    private String ukPhonetic;

    private String usPhonetic;

    private String ukSound;

    private String usSound;

    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese == null ? null : chinese.trim();
    }

    public String getUkPhonetic() {
        return ukPhonetic;
    }

    public void setUkPhonetic(String ukPhonetic) {
        this.ukPhonetic = ukPhonetic == null ? null : ukPhonetic.trim();
    }

    public String getUsPhonetic() {
        return usPhonetic;
    }

    public void setUsPhonetic(String usPhonetic) {
        this.usPhonetic = usPhonetic == null ? null : usPhonetic.trim();
    }

    public String getUkSound() {
        return ukSound;
    }

    public void setUkSound(String ukSound) {
        this.ukSound = ukSound == null ? null : ukSound.trim();
    }

    public String getUsSound() {
        return usSound;
    }

    public void setUsSound(String usSound) {
        this.usSound = usSound == null ? null : usSound.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}