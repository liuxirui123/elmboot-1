package com.neusoft.elmboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration//开启自动化配置 由starter提供服务
@SpringBootApplication
public class ElmBootApplication {
public static void main(String[] args) {
	SpringApplication.run(ElmBootApplication.class, args);
}

}
