package com.english.storm.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
@TableName("english_circle_comment")
public class EnglishCircleComment extends Model<EnglishCircleComment> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("gmt_create")
	private Date gmtCreate;
	@TableField("gmt_modified")
	private Date gmtModified;
    /**
     * 文章表主键
     */
	@TableField("article_id")
	private Long articleId;
    /**
     * 回复者的id
     */
	@TableField("user_id")
	private String userId;
    /**
     * 内容
     */
	private String content;
    /**
     * 音频
     */
	private String voice;
	@TableField("voice_time")
	private Integer voiceTime;
    /**
     * 回复类型
     */
	private Integer type;
    /**
     * 被回复数
     */
	@TableField("comment_count")
	private Integer commentCount;
    /**
     * 点赞数
     */
	@TableField("praise_count")
	private Integer praiseCount;
    /**
     * 举报
     */
	@TableField("is_accusation")
	private Integer isAccusation;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Integer getIsAccusation() {
		return isAccusation;
	}

	public void setIsAccusation(Integer isAccusation) {
		this.isAccusation = isAccusation;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "EnglishCircleComment{" +
			"id=" + id +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", articleId=" + articleId +
			", userId=" + userId +
			", content=" + content +
			", voice=" + voice +
			", voiceTime=" + voiceTime +
			", type=" + type +
			", commentCount=" + commentCount +
			", praiseCount=" + praiseCount +
			", isAccusation=" + isAccusation +
			"}";
	}
}
