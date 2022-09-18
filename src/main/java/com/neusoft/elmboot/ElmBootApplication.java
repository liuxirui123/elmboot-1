package com.neusoft.elmboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//开启自动化配置 由starter提供服务; 包扫描
public class ElmBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElmBootApplication.class, args);
    }

}
