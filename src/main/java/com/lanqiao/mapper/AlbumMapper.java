package com.lanqiao.mapper;

import com.lanqiao.model.Album;
import java.util.List;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Album record);

    Album selectByPrimaryKey(Integer aid);

    List<Album> selectAll();

    int updateByPrimaryKey(Album record);
}