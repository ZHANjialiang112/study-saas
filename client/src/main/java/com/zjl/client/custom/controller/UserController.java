package com.zjl.client.custom.controller;

import com.sun.istack.internal.NotNull;
import com.zjl.client.custom.UserDto;
import com.zjl.client.custom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @NotNull
    private final UserService userService;

    @GetMapping("/test")
    public String  addUser(@RequestBody @Validated UserDto userDto){
        return userService.saveUser(userDto);
    }


}
