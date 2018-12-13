package com.zy.zhuang.controller;

import com.zy.zhuang.request.HelloRequest;
import com.zy.zhuang.response.HelloResponse;
import com.zy.zhuang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    public HelloResponse sayHello(@RequestBody HelloRequest helloRequest) {
        HelloResponse response = new HelloResponse();
        String name = helloService.sayHello(helloRequest.getName());
        response.setName(name);
        return response;
    }
}
