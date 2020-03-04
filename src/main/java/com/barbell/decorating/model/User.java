package com.barbell.decorating.model;

import lombok.Data;

@Data
public class User {
    /*
     * 主键id
     * */
    private Long id;
    /*
     * 用户名
     * */
    private String userName;
    /*
     * 电话号码
     * */
    private int phoneNumber;
    /*
     * 登陆密码
     * */
    private String password;
}
