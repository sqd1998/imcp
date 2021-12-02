package com.wh.controller;

import com.wh.common.util.Result;
import com.wh.pojo.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wh.pojo.User;
import com.wh.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/toLogin.action")
	public String toLogin(){
		return "/page/login-1.jsp";
	}
	@RequestMapping(value = "/toRegister.action")
	public String toRegister(){
		return "/page/register.html";
	}
	@RequestMapping("/register.action" )
	public String register(User user, Factory factory){
		userService.register(user,factory);
		return "/page/login-1.jsp";
	}
	@RequestMapping(value = "/login.action" ,method = RequestMethod.POST)
	public String login(String loginName , String password){
		User user = userService.login(loginName, password);
		if (user != null){
			return "/index.html";
		}else {
			return "";
		}
	}
//	查询工厂
	@RequestMapping(value = "selFac.action",method = RequestMethod.POST)
	@ResponseBody
	public Result selFac(){
		List<Factory> factoryList = userService.selFac();
		return new Result(0,"成功",100,factoryList);
	}
//查询用户
	@RequestMapping(value = "selUser.action")
	@ResponseBody
	public Result selUser(){
		List<User> userList = userService.selUser();
		return new Result(0,"成功",100,userList);
	}
	
//	@RequestMapping("findById")
//	@ResponseBody
//	public User findById(Integer id) {
//		User user = userService.findById(id);
//		return user;
//	}
}
