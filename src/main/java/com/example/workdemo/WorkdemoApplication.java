package com.example.workdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkdemoApplication.class, args);

        System.out.println("启动成功了");
    }

}
