package com.example.webtest.dao;

import com.example.webtest.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User find(int id);
}
