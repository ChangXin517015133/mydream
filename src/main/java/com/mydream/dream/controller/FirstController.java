package com.mydream.dream.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstController {
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}
