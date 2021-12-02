package com.wh.dao;

import com.wh.pojo.Factory;
import com.wh.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	//用户注册
	void register(@Param("user") User user, @Param("factory")Factory factory);
	//用户登录
	User login(@Param("loginName") String loginName, @Param("password") String password);
//	查询工厂
	List<Factory> selFac();
//	查询所有用户
	List<User> selUser();
}
