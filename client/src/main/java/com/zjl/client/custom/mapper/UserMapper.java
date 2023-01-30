package com.zjl.client.custom.mapper;

import com.zjl.client.custom.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wenman
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-01-03 22:14:40
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    public Integer findIdByName(@Param("name") String name);
}




