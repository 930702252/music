package com.lanqiao.mapper;

import com.lanqiao.model.Mv;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MvMapper {
    int deleteByPrimaryKey(Integer mvid);

    int insert(Mv record);

    Mv selectByPrimaryKey(Integer mvid);

    List<Mv> selectAll();

    int updateByPrimaryKey(Mv record);
    
    int selectMvCountBysid(Integer sid);
}