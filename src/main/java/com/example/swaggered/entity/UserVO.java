package com.example.swaggered.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO {

    private String userName;
    private Date birthday;
    private String address;

}
