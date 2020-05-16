package com.example.webtest.service.impl;

import com.example.webtest.ParamAssert;
import com.example.webtest.form.PermissionForm;
import com.example.webtest.mapper.PermissionMapper;
import com.example.webtest.model.Permission;
import com.example.webtest.service.PermissionService;
import com.example.webtest.template.ServiceTemplate;
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
        return new ServiceTemplate<Permission>() {

            @Override
            protected void checkParam() {
                ParamAssert.notNull(id, "权限ID不能为空");
            }

            @Override
            protected Permission process() {
                Permission permission = permissionMapper.selectByPrimaryKey(id);
                return permission;
            }
        }.excute();
    }
}
