package com.wxj.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wxj.dubbo.intface.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/9/16 0016 14:53
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("北京旺旺"));
        return hello;
    }
}