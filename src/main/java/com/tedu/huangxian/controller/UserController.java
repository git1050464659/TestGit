package com.tedu.huangxian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.huangxian.service.IUserService;
import com.tedu.huangxian.service.impl.UserService;
import com.tedu.huangxian.util.UmsMember;



@RestController
public class UserController {

	@Autowired
	IUserService  userService;

	@RequestMapping("index")
	public List<UmsMember> getAllUser (){

		List<UmsMember>  umsMembers=userService.getAllUser();

		return umsMembers;

	}	



}
