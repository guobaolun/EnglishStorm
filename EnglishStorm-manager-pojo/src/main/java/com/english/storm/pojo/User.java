package com.english.storm.pojo;

public class User {
    private String userId;

    private String password;

    private String nickname;

    private String introduce;

    private String portrait;

    private Integer lv;

    private String sex;

    private Long birthday;

    private String email;

    private Long createTime;

    private Long lastTime;

    private Integer permission;

    private String school;

    private String degree;

    private String speciality;

    private String currentCountry;

    private String currentProvince;

    private String currentCity;

    private String currentArea;

    private String hometownCountry;

    private String hometownProvince;

    private String hometownCity;

    private String hometownArea;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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
        this.email = email == null ? null : email.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
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
        this.school = school == null ? null : school.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry == null ? null : currentCountry.trim();
    }

    public String getCurrentProvince() {
        return currentProvince;
    }

    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince == null ? null : currentProvince.trim();
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity == null ? null : currentCity.trim();
    }

    public String getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(String currentArea) {
        this.currentArea = currentArea == null ? null : currentArea.trim();
    }

    public String getHometownCountry() {
        return hometownCountry;
    }

    public void setHometownCountry(String hometownCountry) {
        this.hometownCountry = hometownCountry == null ? null : hometownCountry.trim();
    }

    public String getHometownProvince() {
        return hometownProvince;
    }

    public void setHometownProvince(String hometownProvince) {
        this.hometownProvince = hometownProvince == null ? null : hometownProvince.trim();
    }

    public String getHometownCity() {
        return hometownCity;
    }

    public void setHometownCity(String hometownCity) {
        this.hometownCity = hometownCity == null ? null : hometownCity.trim();
    }

    public String getHometownArea() {
        return hometownArea;
    }

    public void setHometownArea(String hometownArea) {
        this.hometownArea = hometownArea == null ? null : hometownArea.trim();
    }
}