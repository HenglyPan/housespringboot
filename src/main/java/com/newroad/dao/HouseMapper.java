package com.newroad.dao;

import com.newroad.entity.House;

public interface HouseMapper {
    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Long id);
}