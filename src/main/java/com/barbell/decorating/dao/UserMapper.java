package com.barbell.decorating.dao;

import com.barbell.decorating.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * @param
     * @return
     * @title
     * @author cunbo.wang
     * @date 2020/2/17 20:35
     * @useScene 查询所有用户的详细信息。
     * @parameterExample
     * @returnExample
     */
    @Select("select * from user")
    List<User> findAllUsers();

    /**
     * @param
     * @return
     * @title
     * @author cunbo.wang
     * @date 2020/2/23 10:34
     * @useScene 根据id查询用户信息
     * @parameterExample
     * @returnExample
     */
    User getUserById(int id);
}
