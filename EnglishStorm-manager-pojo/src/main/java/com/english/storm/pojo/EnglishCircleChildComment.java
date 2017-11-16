package com.english.storm.pojo;

public class EnglishCircleChildComment {
    private String id;

    private String commentId;

    private String userId;

    private String targetUserId;

    private Long time;

    private String content;

    private String voice;

    private Integer voiceTime;

    private Integer type;

    private Integer commentCount;

    private Integer praiseCount;

    private Integer accusation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId == null ? null : targetUserId.trim();
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
        this.content = content == null ? null : content.trim();
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice == null ? null : voice.trim();
    }

    public Integer getVoiceTime() {
        return voiceTime;
    }

    public void setVoiceTime(Integer voiceTime) {
        this.voiceTime = voiceTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
}