package com.newroad.dao;

import com.newroad.entity.HouseUser;

public interface HouseUserMapper {
    int insert(HouseUser record);

    int insertSelective(HouseUser record);

    HouseUser selectByPrimaryKey(Long id);
}