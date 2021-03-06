package com.lanqiao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.AlbumMapper;

@Service
public class AlbumServiceImpl implements IAlbumService {
	@Autowired
	private AlbumMapper mapper;
	@Override
	public int selectCountBySid(Integer sid) {
	
		return mapper.selectCountBySid(sid);
	}

}
