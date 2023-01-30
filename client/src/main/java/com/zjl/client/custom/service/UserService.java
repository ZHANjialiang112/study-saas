package com.zjl.client.custom.service;

import com.zjl.client.custom.UserDto;
import com.zjl.client.custom.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author wenman
* @description 针对表【user】的数据库操作Service
* @createDate 2023-01-03 22:14:40
*/
public interface UserService extends IService<User> {
    public String saveUser(UserDto userDto);
}
