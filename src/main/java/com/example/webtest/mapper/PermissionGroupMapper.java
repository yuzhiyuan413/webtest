package com.example.webtest.mapper;

import com.example.webtest.dao.BaseRepository;
import com.example.webtest.model.PermissionGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionGroupMapper extends BaseRepository<PermissionGroup> {

}