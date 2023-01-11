package com.example.swaggered.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date birthday;
    private Integer gender;
    private String qq;
    private String wx;
    private Date createTime;
    private Date updateTime;
}
