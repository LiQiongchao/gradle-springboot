package com.yupoop.graldespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/20
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/name")
    public String getName() {
        return "Hello World";
    }

}
