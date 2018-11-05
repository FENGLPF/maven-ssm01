package com.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper UserMapper;
	
	@Override
	public User login(String userName, String userPassword) {
		return UserMapper.checkUser(userName, userPassword);
	}

}
