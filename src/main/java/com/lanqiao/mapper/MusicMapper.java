package com.lanqiao.mapper;

import com.lanqiao.model.Music;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MusicMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Music record);

    Music selectByPrimaryKey(Integer mid);

    List<Music> selectAll();

    int selectMusicCountBysid(Integer sid);
    
    int updateByPrimaryKey(Music record);
    
    List<Music> selectMusicBysid(Integer sid);
}