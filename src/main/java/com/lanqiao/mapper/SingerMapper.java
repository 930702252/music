package com.lanqiao.mapper;

import com.lanqiao.model.Singer;
import java.util.List;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Singer record);

    Singer selectByPrimaryKey(Integer sid);

    List<Singer> selectAll();

    int updateByPrimaryKey(Singer record);
}