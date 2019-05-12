package com.example.webtest.service.impl;

import com.example.webtest.dao.UserMapper;
import com.example.webtest.entity.User;
import com.example.webtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {

    /**
     *注入类 UserMapper
     */
    @Resource
    private UserMapper userMapper;
    @Override
    public User find(int id) {
        return userMapper.find(id);
    }
}
