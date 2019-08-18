package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lanqiao.mapper.UserMapper;
import com.lanqiao.model.User;
import com.lanqiao.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectAll() {
		
		return userMapper.selectAll();
	}

	@Override
	public int updateStatus(User user) {
		return userMapper.updateStatus(user);
		
	}
}
