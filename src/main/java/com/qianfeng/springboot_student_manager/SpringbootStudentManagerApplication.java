package com.qianfeng.springboot_student_manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qianfeng")
@MapperScan("com.qianfeng.dao")
public class SpringbootStudentManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentManagerApplication.class, args);
    }

}
