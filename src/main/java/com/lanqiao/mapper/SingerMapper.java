package com.lanqiao.mapper;

import com.lanqiao.model.Singer;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface SingerMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Singer record);

    Singer selectByPrimaryKey(Integer sid);

    List<Singer> selectAll();

    int updateByPrimaryKey(Singer record);
    
    List<Singer> selectAllByFw(String fw);
    
    List<Singer> selectByType(String type);
}