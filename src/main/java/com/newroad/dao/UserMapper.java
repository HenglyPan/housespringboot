package com.newroad.dao;

import com.newroad.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

public interface UserMapper {
    List<User> getUsers();
   /* int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);*/
}