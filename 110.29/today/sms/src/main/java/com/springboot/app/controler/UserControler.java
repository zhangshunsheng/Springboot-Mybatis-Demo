package com.springboot.app.controler;

import com.springboot.app.domain.User;
import com.springboot.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControler {

    @Autowired
    UserService userService;

    @GetMapping("/add")
    public void addUser(){}

    @GetMapping("/delete")
    public void deleteUser(){}

    @GetMapping("/change")
    public void changeUser(){}

    @GetMapping("/find")
    public List<User> findUser(){
        return userService.findAllUser();
    }

}
