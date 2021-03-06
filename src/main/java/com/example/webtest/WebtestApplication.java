package com.example.webtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.webtest.mapper")
public class WebtestApplication {

    public static void main(String[] args) {
        System.out.println("hello...............");
        SpringApplication.run(WebtestApplication.class, args);
    }

}
