package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.model.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public User login(HttpServletRequest request) {
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
		logger.info(userName+userPassword);
		return userService.login(userName, userPassword);
	}
}
