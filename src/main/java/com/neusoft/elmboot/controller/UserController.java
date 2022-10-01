package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.entity.UserEntity;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByIdByPass")
    public User getUserByIdByPass(User user) {
        return userService.getUserByIdByPass(user);
    }

    @RequestMapping("/getUserById")
    public int getUserById(String userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping("/saveUser")
    public int saveUser(UserEntity user) {
        return userService.saveUser(user);
    }
}