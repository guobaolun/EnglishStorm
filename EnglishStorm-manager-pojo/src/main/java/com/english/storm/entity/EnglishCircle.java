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
@TableName("english_circle")
public class EnglishCircle extends Model<EnglishCircle> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("gmt_create")
	private Date gmtCreate;
	@TableField("gmt_modified")
	private Date gmtModified;
	@TableField("user_id")
	private String userId;
    /**
     * 内容
     */
	private String content;
    /**
     * 图片url数组
     */
	@TableField("image_list")
	private String imageList;
    /**
     * 封面图片
     */
	@TableField("voice_img")
	private String voiceImg;
    /**
     * 音频
     */
	private String voice;
	@TableField("voice_time")
	private Integer voiceTime;
    /**
     * 回复数
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

	public String getImageList() {
		return imageList;
	}

	public void setImageList(String imageList) {
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

	public Integer getVoiceTime() {
		return voiceTime;
	}

	public void setVoiceTime(Integer voiceTime) {
		this.voiceTime = voiceTime;
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
		return "EnglishCircle{" +
			"id=" + id +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", userId=" + userId +
			", content=" + content +
			", imageList=" + imageList +
			", voiceImg=" + voiceImg +
			", voice=" + voice +
			", voiceTime=" + voiceTime +
			", commentCount=" + commentCount +
			", praiseCount=" + praiseCount +
			", isAccusation=" + isAccusation +
			"}";
	}
}
