package com.lanqiao.service;

import org.springframework.stereotype.Service;

import com.lanqiao.mapper.MvMapper;

@Service
public class MvServiceImpl implements IMvService {
	
	private MvMapper mapper;
	@Override
	public int selectMvCountBysid(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectMvCountBysid(sid);
	}

}
