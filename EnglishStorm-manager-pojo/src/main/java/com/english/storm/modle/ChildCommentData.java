package com.english.storm.modle;

import com.english.storm.entity.PhoneticChildComment;
import com.english.storm.entity.User;

/**
 * @author guobaolun
 */
public class ChildCommentData {

    private long id;

    private long commentId;

    private String userId;

    private String nickname;

    private String portrait;

    private String targetUserId;

    private String targetUserNickname;

    private long time;

    private String content;

    private String voice;

    private Integer voiceTime;

    private Integer type;

    private Integer praiseCount;


    public ChildCommentData(PhoneticChildComment childComment, User childUser, User childTargetUser) {
        childComment.getId();
        commentId = childComment.getCommentId();
        userId = childComment.getUserId();
        nickname = childUser.getNickname();
        portrait = childUser.getPortrait();
        targetUserId = childTargetUser.getUserId();
        nickname = childTargetUser.getNickname();
        time = childComment.getTime();
        content = childComment.getContent();
        voice = childComment.getVoice();
        voiceTime = childComment.getVoiceTime();
        type = childComment.getType();
        praiseCount = childComment.getPraiseCount();
    }

    public ChildCommentData(long id, long commentId, String userId, String nickname, String portrait, String targetUserId, String targetUserNickname, long time, String content, String voice, Integer voiceTime, Integer type, Integer praiseCount) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
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
