package com.zjl.client.custom.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class LoginController {

    @PostMapping("/register")
    public String register(){
        return "登录成功";
    }
}
