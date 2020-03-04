package com.barbell.decorating.controller;

import com.barbell.decorating.dao.UserMapper;
import com.barbell.decorating.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/findAll")
    @ResponseBody ResponseEntity<List<User>> findAll(){
        List<User> userList = userMapper.findAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
