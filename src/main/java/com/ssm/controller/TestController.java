package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/t1")
	@ResponseBody
	public String t1() {
		return "t221";
	}
	
	@RequestMapping("t2")
	@ResponseBody
	public String t2() {
		return "t2123";
	}
}
