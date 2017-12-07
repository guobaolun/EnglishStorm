package com.english.storm.modle;

/**
 * Created by Kuo on 2017/6/8.
 */
public class UserResponse  {

    private String token ="";

    private String userId="";

    private String nickname="";

    private String introduce="";

    private String portrait ="";

    private String portraitThumbnail ="";

    private Integer lv;

    private Integer sex;

    private Long birthday;

    private String email="";

    private Integer permission;

    private String school="";

    private String degree="";

    private String speciality="";

    private String currentCountry;

    private String currentProvince;

    private String currentCity;

    private String currentArea;

    private String hometownCountry;

    private String hometownProvince;

    private String hometownCity;

    private String hometownArea;


    public String getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(String currentArea) {
        this.currentArea = currentArea;
    }

    public String getHometownArea() {
        return hometownArea;
    }

    public void setHometownArea(String hometownArea) {
        this.hometownArea = hometownArea;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


    public String getPortraitThumbnail() {
        return portraitThumbnail;
    }

    public void setPortraitThumbnail(String portraitThumbnail) {
        this.portraitThumbnail = portraitThumbnail;
    }
}
