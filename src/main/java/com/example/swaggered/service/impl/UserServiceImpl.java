package com.example.swaggered.service.impl;

import com.example.swaggered.dao.UserDao;
import com.example.swaggered.entity.UserVO;
import com.example.swaggered.entity.po.User;
import com.example.swaggered.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public void save(UserVO userVO) {
        User user = modelMapper.map(userVO, User.class);
        userDao.save(user);
    }

    @Override
    public UserVO getUserById(Long id) {
        User user = userDao.getUserById(id);
        return user==null?null:modelMapper.map(user,UserVO.class);
    }
}
