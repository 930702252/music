package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.User;

public interface AdminService {

	List<User> selectAll();

	int updateStatus(User user);

}
