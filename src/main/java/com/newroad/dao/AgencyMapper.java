package com.newroad.dao;

import com.newroad.entity.Agency;

public interface AgencyMapper {
    int insert(Agency record);

    int insertSelective(Agency record);

    Agency selectByPrimaryKey(Integer id);
}