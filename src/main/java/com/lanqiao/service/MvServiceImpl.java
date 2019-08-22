package com.lanqiao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.MvMapper;

@Service
public class MvServiceImpl implements IMvService {
	@Autowired
	private MvMapper mapper;
	@Override
	public int selectMvCountBysid(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectMvCountBysid(sid);
	}

}
