package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 整个类下面的 url 都会拼接一个 system 的前缀路径
//@RequestMapping("/system")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }

}
