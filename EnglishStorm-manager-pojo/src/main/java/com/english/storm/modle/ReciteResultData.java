package com.english.storm.modle;

/**
 * Created by Kuo on 2017/11/29.
 */
public class ReciteResultData {

    private String word;
    private String inputWord;
    private int inputTime;
    private int increaseProgress;
    private long reciteTime;
    private int progress;

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public int getInputTime() {
        return inputTime;
    }

    public void setInputTime(int inputTime) {
        this.inputTime = inputTime;
    }

    public int getIncreaseProgress() {
        return increaseProgress;
    }

    public void setIncreaseProgress(int increaseProgress) {
        this.increaseProgress = increaseProgress;
    }

    public long getReciteTime() {
        return reciteTime;
    }

    public void setReciteTime(long reciteTime) {
        this.reciteTime = reciteTime;
    }
}
