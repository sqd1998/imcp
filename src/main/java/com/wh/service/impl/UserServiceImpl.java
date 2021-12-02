package com.wh.service.impl;

import com.wh.dao.UserMapper;
import com.wh.pojo.Factory;
import com.wh.pojo.User;
import com.wh.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

	private UserMapper mapper;

	@Override
	public void register(User user, Factory factory) {
		mapper.register(user,factory);
	}

	@Override
	public User login(String loginName, String password) {
		return mapper.login(loginName,password);
	}

	@Override
	public List<Factory> selFac() {
		return mapper.selFac();
	}

	@Override
	public List<User> selUser() {
		return mapper.selUser();
	}

	public UserMapper getMapper() {
		return mapper;
	}
	public void setMapper(UserMapper mapper) {
		this.mapper = mapper;
	}



}
