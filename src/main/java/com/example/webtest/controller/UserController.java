package com.example.webtest.controller;

import com.example.webtest.entity.User;
import com.example.webtest.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired(required = true)
    private UserService userService;

    @RequestMapping("/find")
    public User find(int id){
        User user = userService.find(id);
        return user;
    }

    @RequestMapping("/hello")
    public String index(){
        return "Hello world";
    }
}
