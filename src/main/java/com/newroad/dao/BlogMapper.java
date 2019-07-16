package com.newroad.dao;

import com.newroad.entity.Blog;

public interface BlogMapper {
    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);
}