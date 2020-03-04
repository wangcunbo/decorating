package com.barbell.decorating;

import com.barbell.decorating.dao.UserMapper;
import com.barbell.decorating.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author cunbo.wang
 * @description
 * @date 2020/2/17 20:40
 */
public class MybatisTest {
    @Test
    public void getAllUserTest() {
        try {
            // 1. 读取配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

            // 2. 创建SqlSessionFactory工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            // 3. 创建sqlSession
            SqlSession sqlSession = factory.openSession();

            // 4. SqlSession 完全包含了面向数据库执行 SQL 命令所需的所有方法
            // 使用正确描述每个语句的参数和返回值的接口（比如 BlogMapper.class），
            // 你现在不仅可以执行更清晰和类型安全的代码，而且还不用担心易错的字符串字面值以及强制类型转换
            UserMapper userDaoMapper = sqlSession.getMapper(UserMapper.class);
            // 5. 执行方法
            List<User> all = userDaoMapper.findAllUsers();
            for (User user : all) {
                System.out.println(user);
            }

            // 6, 释放资源
            sqlSession.close();
            resourceAsStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
