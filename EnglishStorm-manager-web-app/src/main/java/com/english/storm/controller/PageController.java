package com.english.storm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guobaolun
 * 页面控制器
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
		
	}

	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;

	}
}
