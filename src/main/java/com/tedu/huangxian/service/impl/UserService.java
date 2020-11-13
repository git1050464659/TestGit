package com.tedu.huangxian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.huangxian.mapper.UserMapper;
import com.tedu.huangxian.service.IUserService;
import com.tedu.huangxian.util.UmsMember;
@Service
public class UserService   implements IUserService {

	@Autowired
	UserMapper usermapp;


	@Override
	public List<UmsMember> getAllUser() {
		System.out.println("111");
		List<UmsMember> alluser=  usermapp.selectAlluser();
		System.out.println(alluser+"111");

		return alluser ;
	}




}
