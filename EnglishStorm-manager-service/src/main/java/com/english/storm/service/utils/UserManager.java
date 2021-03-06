package com.english.storm.service.utils;

import com.english.storm.entity.User;
import com.english.storm.modle.UserResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;


    @Value("${IMAGE_THUMBNAIL_360}")
    private String IMAGE_THUMBNAIL_360;


    public UserResponse getUserResponse(User user, String token){

        UserResponse userResponse =  new UserResponse();
        userResponse.setToken(token);
        userResponse.setUserId(user.getUserId());
        userResponse.setNickname(user.getNickname());
        userResponse.setIntroduce(user.getIntroduce());
        userResponse.setPortrait(IMAGE_SERVER_BASE_URL+user.getPortrait());
        userResponse.setPortraitThumbnail(IMAGE_SERVER_BASE_URL+user.getPortrait()+IMAGE_THUMBNAIL_360);
        userResponse.setSex(user.getIsSex());

        if (user.getBirthday() !=null){
            userResponse.setBirthday(user.getBirthday().getTime());
        }else{
            userResponse.setBirthday(0L);
        }
        userResponse.setSchool(user.getSchool());
        userResponse.setDegree(user.getDegree());
        userResponse.setSpeciality(user.getSpeciality());
        userResponse.setLv(user.getLv());
        userResponse.setPermission(user.getPermission());
        userResponse.setCurrentCountry(user.getCurrentCountry());
        userResponse.setCurrentProvince(user.getCurrentProvince());
        userResponse.setCurrentCity(user.getCurrentCity());
        userResponse.setCurrentArea(user.getCurrentArea());
        userResponse.setHometownCountry(user.getHometownCountry());
        userResponse.setHometownProvince(user.getHometownProvince());
        userResponse.setHometownCity(user.getHometownCity());
        userResponse.setHometownArea(user.getHometownArea());
        return userResponse;
    }
}
