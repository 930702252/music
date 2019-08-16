package com.lanqiao.mapper;

import com.lanqiao.model.Mv;
import java.util.List;

public interface MvMapper {
    int deleteByPrimaryKey(Integer mvid);

    int insert(Mv record);

    Mv selectByPrimaryKey(Integer mvid);

    List<Mv> selectAll();

    int updateByPrimaryKey(Mv record);
}