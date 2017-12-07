package com.english.storm.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author guobaolun
 * @since 2017-12-03
 */
public class Word extends Model<Word> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("gmt_create")
	private Date gmtCreate;
	@TableField("gmt_modified")
	private Date gmtModified;
	private String word;
	private String chinese;
	@TableField("uk_phonetic")
	private String ukPhonetic;
	@TableField("us_phonetic")
	private String usPhonetic;
	@TableField("uk_sound")
	private String ukSound;
	@TableField("us_sound")
	private String usSound;


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

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getChinese() {
		return chinese;
	}

	public void setChinese(String chinese) {
		this.chinese = chinese;
	}

	public String getUkPhonetic() {
		return ukPhonetic;
	}

	public void setUkPhonetic(String ukPhonetic) {
		this.ukPhonetic = ukPhonetic;
	}

	public String getUsPhonetic() {
		return usPhonetic;
	}

	public void setUsPhonetic(String usPhonetic) {
		this.usPhonetic = usPhonetic;
	}

	public String getUkSound() {
		return ukSound;
	}

	public void setUkSound(String ukSound) {
		this.ukSound = ukSound;
	}

	public String getUsSound() {
		return usSound;
	}

	public void setUsSound(String usSound) {
		this.usSound = usSound;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Word{" +
			"id=" + id +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", word=" + word +
			", chinese=" + chinese +
			", ukPhonetic=" + ukPhonetic +
			", usPhonetic=" + usPhonetic +
			", ukSound=" + ukSound +
			", usSound=" + usSound +
			"}";
	}
}
