package com.newroad.dao;

import com.newroad.entity.HouseMsg;

public interface HouseMsgMapper {
    int insert(HouseMsg record);

    int insertSelective(HouseMsg record);

    HouseMsg selectByPrimaryKey(Long id);
}