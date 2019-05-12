package com.example.webtest.entity;

import lombok.Data;

@Data
public class User extends Base {
    private String name;
    private String userNo;
    private String address;
}
