package com.newroad.dao;

import com.newroad.entity.Comment;

public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);
}