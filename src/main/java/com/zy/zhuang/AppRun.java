package com.zy.zhuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/11/28 19:41
 * @Description:
 */

@SpringBootApplication
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
        System.out.println("AppRun start.");
    }
}
