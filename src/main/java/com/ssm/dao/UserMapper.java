package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.User;

public interface UserMapper {
	
	public User checkUser(@Param("userName")String userName,@Param("userPassword")String userPassword);
	
    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}