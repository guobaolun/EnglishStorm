package com.english.storm.modle;

import java.util.List;

/**
 * @author guobaolun
 */
public class EnglishCircleData {

    private long id;

    private String userId;

    private Long time;

    private String content;

    private List<String> imageList;

    private List<String> imageThumbnailList;

    private String voiceImg;

    private String voiceImgThumbnail;

    private String voice;

    private Integer commentCount;

    private Integer praiseCount;

    private Integer accusation;

    private String nickname;

    private String portrait;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public String getVoiceImg() {
        return voiceImg;
    }

    public void setVoiceImg(String voiceImg) {
        this.voiceImg = voiceImg;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }

    public Integer getAccusation() {
        return accusation;
    }

    public void setAccusation(Integer accusation) {
        this.accusation = accusation;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public List<String> getImageThumbnailList() {
        return imageThumbnailList;
    }

    public void setImageThumbnailList(List<String> imageThumbnailList) {
        this.imageThumbnailList = imageThumbnailList;
    }

    public String getVoiceImgThumbnail() {
        return voiceImgThumbnail;
    }

    public void setVoiceImgThumbnail(String voiceImgThumbnail) {
        this.voiceImgThumbnail = voiceImgThumbnail;
    }
}
