package com.linmsen.microddddemo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Test {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
