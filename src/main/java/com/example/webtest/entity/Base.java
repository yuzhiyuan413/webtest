package com.example.webtest.entity;

import lombok.Data;

import java.util.Date;

/**
 * 数据库公共字段
 */
@Data
public class Base {
    private long id;
    private int delFlag;
    private Date createTime;
    private Date updateTime;
}
