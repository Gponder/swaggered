package com.example.swaggered.service;

import com.example.swaggered.entity.UserVO;

public interface UserService {

    public void save(UserVO userVO);

    UserVO getUserById(Long id);
}
