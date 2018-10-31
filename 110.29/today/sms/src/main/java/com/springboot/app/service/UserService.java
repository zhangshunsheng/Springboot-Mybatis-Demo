package com.springboot.app.service;

import com.springboot.app.domain.User;
import com.springboot.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired   //依赖注入，依赖于UserMapper层
    UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }
}


