package com.example.webtest.controller;

import com.example.webtest.model.Permission;
import com.example.webtest.service.PermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PermissionController {

    @Resource
    private PermissionService permissionService;

    @GetMapping("/permissions/find")
    public Permission find(@RequestParam("id") Long id){
        Permission permission = permissionService.findPermission(id);
        return permission;
    }

    @RequestMapping("/hello")
    public String index(){
        return "Hello world";
    }
}
