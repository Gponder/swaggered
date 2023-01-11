package com.example.swaggered.dao;

import com.example.swaggered.entity.po.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    void save(User user);

    User getUserById(Long id);
}
