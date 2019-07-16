package com.newroad.service.Imp;
import com.newroad.dao.UserMapper;
import com.newroad.entity.User;
import com.newroad.service.UserServiceIf;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImp implements UserServiceIf {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.getUserList();
    }
}
