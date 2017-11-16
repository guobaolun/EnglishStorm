package com.english.storm.pojo;

public class MemoryProgress {
    private Integer id;

    private Integer userId;

    private Integer wordId;

    private Long spellTime;

    private Long memoryTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

    public Long getSpellTime() {
        return spellTime;
    }

    public void setSpellTime(Long spellTime) {
        this.spellTime = spellTime;
    }

    public Long getMemoryTime() {
        return memoryTime;
    }

    public void setMemoryTime(Long memoryTime) {
        this.memoryTime = memoryTime;
    }
}