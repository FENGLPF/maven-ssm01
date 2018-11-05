package com.ssm.service;

import com.ssm.model.User;

public interface UserService {
	public User login(String userName,String userPassword);
}
