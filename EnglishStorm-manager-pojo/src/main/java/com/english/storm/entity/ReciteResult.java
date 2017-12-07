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
@TableName("recite_result")
public class ReciteResult extends Model<ReciteResult> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 创建时间
     */
	@TableField("gmt_create")
	private Date gmtCreate;
    /**
     * 修改时间
     */
	@TableField("gmt_modified")
	private Date gmtModified;
    /**
     * 用户id
     */
	@TableField("user_id")
	private String userId;
	private String word;
    /**
     * 用户拼写单词
     */
	@TableField("input_word")
	private String inputWord;
    /**
     * 输入用时
     */
	@TableField("input_time")
	private Integer inputTime;
    /**
     * 增加进度值
     */
	@TableField("increase_progress")
	private Integer increaseProgress;
    /**
     * 时间
     */
	@TableField("recite_time")
	private Date reciteTime;
    /**
     * 是否正确
     */
	@TableField("is_right")
	private Integer isRight;


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

	public Integer getInputTime() {
		return inputTime;
	}

	public void setInputTime(Integer inputTime) {
		this.inputTime = inputTime;
	}

	public Integer getIncreaseProgress() {
		return increaseProgress;
	}

	public void setIncreaseProgress(Integer increaseProgress) {
		this.increaseProgress = increaseProgress;
	}

	public Date getReciteTime() {
		return reciteTime;
	}

	public void setReciteTime(Date reciteTime) {
		this.reciteTime = reciteTime;
	}

	public Integer getIsRight() {
		return isRight;
	}

	public void setIsRight(Integer isRight) {
		this.isRight = isRight;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ReciteResult{" +
			"id=" + id +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", userId=" + userId +
			", word=" + word +
			", inputWord=" + inputWord +
			", inputTime=" + inputTime +
			", increaseProgress=" + increaseProgress +
			", reciteTime=" + reciteTime +
			", isRight=" + isRight +
			"}";
	}
}
