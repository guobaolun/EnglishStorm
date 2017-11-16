package com.english.storm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PageController {


    @RequestMapping("/")
    public String showPage() {
        return "login";

    }

    @RequestMapping("page/login")
    public String showLogin() {
        return "login";

    }


    @RequestMapping("/page/index")
    public String showIndex(HttpServletRequest request, HttpServletResponse response) {
        boolean isLogin = checkLogin(request, response);
        if (!isLogin) {
            return "login";
        }
        return "index";
    }


    @RequestMapping("/page/word/tables")
    public String showWordTables(HttpServletRequest request, HttpServletResponse response) {
        boolean isLogin = checkLogin(request, response);
        if (!isLogin) {
            return "login";
        }
        return "word_tables";
    }


    private boolean checkLogin(HttpServletRequest request, HttpServletResponse response) {
        try {
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : request.getCookies()) {
                    if ("JSESSIONID".equals(cookie.getName())) {
                        return true;
                    }
                }
            }
            response.sendRedirect(request.getContextPath()+"/page/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



}
