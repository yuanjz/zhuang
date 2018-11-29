package com.zy.zhuang.impl;

import com.zy.zhuang.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/11/29 11:20
 * @Description:
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
