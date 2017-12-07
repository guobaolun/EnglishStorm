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
@TableName("login_info")
public class LoginInfo extends Model<LoginInfo> {

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
     * 国家
     */
	private String country;
    /**
     * 省
     */
	private String province;
    /**
     * 市
     */
	private String city;
    /**
     * 区
     */
	private String area;
    /**
     * 详细地址
     */
	private String addstr;
    /**
     * 经度
     */
	private String lng;
    /**
     * 纬度
     */
	private String lat;
    /**
     * 手机型号
     */
	private String model;
    /**
     * 系统
     */
	private String os;
    /**
     * 手机系统版本
     */
	@TableField("os_version")
	private String osVersion;
    /**
     * 屏幕宽度
     */
	private Integer width;
    /**
     * 屏幕高度
     */
	private Integer height;
    /**
     * 物理网卡地址
     */
	private String mac;
    /**
     * 手机imei
     */
	private String imei;
    /**
     * 手机卡imsi
     */
	private String imsi;
    /**
     * app版本号
     */
	@TableField("app_version")
	private String appVersion;
    /**
     * ip地址
     */
	private String ip;


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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddstr() {
		return addstr;
	}

	public void setAddstr(String addstr) {
		this.addstr = addstr;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "LoginInfo{" +
			"id=" + id +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", userId=" + userId +
			", country=" + country +
			", province=" + province +
			", city=" + city +
			", area=" + area +
			", addstr=" + addstr +
			", lng=" + lng +
			", lat=" + lat +
			", model=" + model +
			", os=" + os +
			", osVersion=" + osVersion +
			", width=" + width +
			", height=" + height +
			", mac=" + mac +
			", imei=" + imei +
			", imsi=" + imsi +
			", appVersion=" + appVersion +
			", ip=" + ip +
			"}";
	}
}
