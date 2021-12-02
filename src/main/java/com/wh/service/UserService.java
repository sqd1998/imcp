package com.wh.service;

import com.wh.pojo.Factory;
import com.wh.pojo.User;

import java.util.List;

public interface UserService {
	//用户注册
	void register(User user, Factory factory);
	//用户登录
	User login(String loginName, String password);
	//	查询工厂
	List<Factory> selFac();
	//	查询所有用户
	List<User> selUser();
}
