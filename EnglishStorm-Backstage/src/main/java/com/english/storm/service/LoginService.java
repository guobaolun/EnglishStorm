package com.english.storm.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.english.storm.common.pojo.EnglishStormResult;

public interface LoginService {
	EnglishStormResult login(String username, String password, HttpServletRequest request, HttpServletResponse response);
}
