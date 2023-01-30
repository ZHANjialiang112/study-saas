package com.zjl.client.custom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjl.client.custom.UserDto;
import com.zjl.client.custom.common.domain.ContextCommonFiled;
import com.zjl.client.custom.domain.User;
import com.zjl.client.custom.mapper.UserMapper;
import com.zjl.client.custom.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

/**
* @author wenman
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-01-03 22:14:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public String saveUser(UserDto userDto){
        if (Objects.isNull(userDto)){
            return "用户信息为空";
        }
        Integer id = this.getBaseMapper().findIdByName(userDto.getName());
        if (Objects.nonNull(id)){
            return "用户已存在";
        }
        User user = new User();
        userDto.setSqlName(userDto.getName() + ContextCommonFiled.SECRET);
        BeanUtils.copyProperties(userDto,user);
        save(user);
        return "保存成功";
    }
}




