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
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("gmt_create")
	private Date gmtCreate;
	@TableField("gmt_modified")
	private Date gmtModified;
    /**
     * 会员号
     */
	@TableField("es_number")
	private String esNumber;
	@TableField("user_id")
	private String userId;
    /**
     * 密码
     */
	private String password;
    /**
     * 呢称
     */
	private String nickname;
    /**
     * 简介
     */
	private String introduce;
    /**
     * 头像
     */
	private String portrait;
    /**
     * 等级
     */
	private Integer lv;
    /**
     * 性别
     */
	@TableField("is_sex")
	private Integer isSex;
    /**
     * 出生日期
     */
	private Date birthday;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 最后登录时间
     */
	@TableField("last_time")
	private Date lastTime;
    /**
     * 权限
     */
	private Integer permission;
    /**
     * 学校
     */
	private String school;
    /**
     * 学历
     */
	private String degree;
    /**
     * 专业
     */
	private String speciality;
    /**
     * 所在地
     */
	@TableField("current_country")
	private String currentCountry;
    /**
     * 所在省份
     */
	@TableField("current_province")
	private String currentProvince;
    /**
     * 所在城市
     */
	@TableField("current_city")
	private String currentCity;
    /**
     * 当前区
     */
	@TableField("current_area")
	private String currentArea;
    /**
     * 故乡
     */
	@TableField("hometown_country")
	private String hometownCountry;
    /**
     * 故乡省份
     */
	@TableField("hometown_province")
	private String hometownProvince;
    /**
     * 故乡城市
     */
	@TableField("hometown_city")
	private String hometownCity;
    /**
     * 故乡区
     */
	@TableField("hometown_area")
	private String hometownArea;


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

	public String getEsNumber() {
		return esNumber;
	}

	public void setEsNumber(String esNumber) {
		this.esNumber = esNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public Integer getLv() {
		return lv;
	}

	public void setLv(Integer lv) {
		this.lv = lv;
	}

	public Integer getIsSex() {
		return isSex;
	}

	public void setIsSex(Integer isSex) {
		this.isSex = isSex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCurrentCountry() {
		return currentCountry;
	}

	public void setCurrentCountry(String currentCountry) {
		this.currentCountry = currentCountry;
	}

	public String getCurrentProvince() {
		return currentProvince;
	}

	public void setCurrentProvince(String currentProvince) {
		this.currentProvince = currentProvince;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getCurrentArea() {
		return currentArea;
	}

	public void setCurrentArea(String currentArea) {
		this.currentArea = currentArea;
	}

	public String getHometownCountry() {
		return hometownCountry;
	}

	public void setHometownCountry(String hometownCountry) {
		this.hometownCountry = hometownCountry;
	}

	public String getHometownProvince() {
		return hometownProvince;
	}

	public void setHometownProvince(String hometownProvince) {
		this.hometownProvince = hometownProvince;
	}

	public String getHometownCity() {
		return hometownCity;
	}

	public void setHometownCity(String hometownCity) {
		this.hometownCity = hometownCity;
	}

	public String getHometownArea() {
		return hometownArea;
	}

	public void setHometownArea(String hometownArea) {
		this.hometownArea = hometownArea;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", esNumber=" + esNumber +
			", userId=" + userId +
			", password=" + password +
			", nickname=" + nickname +
			", introduce=" + introduce +
			", portrait=" + portrait +
			", lv=" + lv +
			", isSex=" + isSex +
			", birthday=" + birthday +
			", email=" + email +
			", lastTime=" + lastTime +
			", permission=" + permission +
			", school=" + school +
			", degree=" + degree +
			", speciality=" + speciality +
			", currentCountry=" + currentCountry +
			", currentProvince=" + currentProvince +
			", currentCity=" + currentCity +
			", currentArea=" + currentArea +
			", hometownCountry=" + hometownCountry +
			", hometownProvince=" + hometownProvince +
			", hometownCity=" + hometownCity +
			", hometownArea=" + hometownArea +
			"}";
	}
}
