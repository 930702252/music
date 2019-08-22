package com.lanqiao.service;

import org.springframework.stereotype.Service;

import com.lanqiao.mapper.AlbumMapper;

@Service
public class AlbumServiceImpl implements IAlbumService {
	
	private AlbumMapper mapper;
	@Override
	public int selectCountBySid(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectCountBySid(sid);
	}

}
