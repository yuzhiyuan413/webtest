package com.example.webtest.service;

import com.example.webtest.form.PermissionForm;
import com.example.webtest.model.Permission;

public interface PermissionService {
    boolean insertPermission(PermissionForm permissionForm);
    boolean updatePermission(PermissionForm permissionForm);
    Permission findPermission(Long permissionId);
}
