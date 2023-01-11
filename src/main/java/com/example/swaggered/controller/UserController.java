package com.example.swaggered.controller;

import com.example.swaggered.entity.UserVO;
import com.example.swaggered.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public UserVO get(Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public void post(UserVO userVO){
        userService.save(userVO);
    }

}
