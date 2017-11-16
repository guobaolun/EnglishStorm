package com.english.storm.controller;

import com.english.storm.common.pojo.EnglishStormResult;
import com.english.storm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;


	@RequestMapping(value="/user/login", method=RequestMethod.POST)
	@ResponseBody
	public EnglishStormResult login(String username, String password, HttpServletRequest request, HttpServletResponse response) {





		EnglishStormResult result;
		try {
			result = loginService.login(username, password, request, response);
		}catch (Exception e){

			System.out.println(e.getMessage());
			result = EnglishStormResult.build(EnglishStormResult.Status.SERVER_ERROR);
		}

		return result;
	}



}