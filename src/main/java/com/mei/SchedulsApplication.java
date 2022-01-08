package com.mei;

import com.mei.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//开启异步注解功能
@EnableAsync
//开启定时功能
@EnableScheduling
@SpringBootApplication
public class SchedulsApplication {

    public static void main(String[] args) {

        SpringApplication.run(SchedulsApplication.class, args);
    }

}
