package com.mei.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    //cron表达式，计划任务
    //秒 分 时 日 月 周几
    @Scheduled(cron = "0 04 15 * * ?")
    public void hello(){
        //在特定时间执行
        System.out.println("hello,exe");
    }

}
