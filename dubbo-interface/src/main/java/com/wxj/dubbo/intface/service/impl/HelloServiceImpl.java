package com.wxj.dubbo.intface.service.impl;

import com.wxj.dubbo.intface.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/9/16 0016 15:47
 */
@Service
//@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}