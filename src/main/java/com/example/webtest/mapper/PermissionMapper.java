package com.example.webtest.mapper;

import com.example.webtest.dao.BaseRepository;
import com.example.webtest.model.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionMapper extends BaseRepository<Permission> {

}