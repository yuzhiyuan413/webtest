package com.example.webtest.service.impl;

import com.example.webtest.form.PermissionForm;
import com.example.webtest.mapper.PermissionMapper;
import com.example.webtest.model.Permission;
import com.example.webtest.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public boolean insertPermission(PermissionForm permissionForm) {
        return false;
    }

    @Override
    public boolean updatePermission(PermissionForm permissionForm) {
        return false;
    }

    @Override
    public Permission findPermission(Long id) {
        Permission permission = permissionMapper.selectByPrimaryKey(id);
        return permission;
    }
}
