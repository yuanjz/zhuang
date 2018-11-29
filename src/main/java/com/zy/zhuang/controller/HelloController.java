package com.zy.zhuang.controller;

import com.zy.zhuang.request.HelloRequest;
import com.zy.zhuang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YuanJiZhuang
 * @Date: 2018/11/29 11:20
 * @Description:
 */

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public String sayHello(@RequestBody HelloRequest helloRequest) {
        return helloService.sayHello(helloRequest.getName());
    }
}
