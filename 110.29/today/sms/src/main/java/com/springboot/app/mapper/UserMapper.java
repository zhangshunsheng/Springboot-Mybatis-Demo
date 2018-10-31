package com.springboot.app.mapper;

import com.springboot.app.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser();
}
