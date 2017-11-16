package com.english.storm.entity;

public class ChildCommentData {

    private String id;

    private String commentId;

    private String userId;

    private String nickname;

    private String portrait;

    private String targetUserId;

    private String targetUserNickname;

    private Long time;

    private String content;

    private String voice;

    private Integer voiceTime;

    private Integer type;

    private Integer praiseCount;


    public ChildCommentData(String id, String commentId, String userId, String nickname, String portrait, String targetUserId, String targetUserNickname, Long time, String content, String voice, Integer voiceTime, Integer type, Integer praiseCount) {
        this.id = id;
        this.commentId = commentId;
        this.userId = userId;
        this.nickname = nickname;
        this.portrait = portrait;
        this.targetUserId = targetUserId;
        this.targetUserNickname = targetUserNickname;
        this.time = time;
        this.content = content;
        this.voice = voice;
        this.voiceTime = voiceTime;
        this.type = type;
        this.praiseCount = praiseCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }

    public String getTargetUserNickname() {
        return targetUserNickname;
    }

    public void setTargetUserNickname(String targetUserNickname) {
        this.targetUserNickname = targetUserNickname;
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

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
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

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }
}
