package com.lanqiao.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.User;
import com.lanqiao.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	

	@RequestMapping("/selectUser")
	public List<User> selectUser(){
		List<User> list = adminService.selectAll();
		
		for (User user : list) {
	/*		System.out.println(user.getUsername());*/
			if ("1".equals(user.getUsertype())) {
				user.setUsertype("普通用户");
			} else {
				user.setUsertype("管理员");
			}
			if ("0".equals(user.getUserstatus())) {
				user.setUserstatus("不可用");
			} else {
				user.setUserstatus("可用");
			}
			System.out.println(user.getCreatetime());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
			/*Date date = (Date)sdf.format(user.getCreatetime());*/
		/*	user.setCreatetime(date);*/
		}
		return list;
	} 
	
	@RequestMapping("/updateStatus")
	public int updateStatus(User user){
		if ("0".equals(user.getUserstatus())) {
			user.setUserstatus("1");
		} else {
			user.setUserstatus("0");
		}
		int a= adminService.updateStatus(user);
		return a;
		
	}
	
	
	
	
}
