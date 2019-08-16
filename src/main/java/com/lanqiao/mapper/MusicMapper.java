package com.lanqiao.mapper;

import com.lanqiao.model.Music;
import java.util.List;

public interface MusicMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Music record);

    Music selectByPrimaryKey(Integer mid);

    List<Music> selectAll();

    int updateByPrimaryKey(Music record);
}