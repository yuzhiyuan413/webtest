package com.example.webtest.mapper;

import com.example.webtest.dao.BaseRepository;
import com.example.webtest.model.Permission;

public interface PermissionMapper extends BaseRepository {
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}