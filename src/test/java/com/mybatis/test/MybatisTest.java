package com.mybatis.test;


import com.mybatis.dao.UserDao;
import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    public static void main(String[] args) throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> users =userDao.findAll();
        for(User user : users){

            System.out.println(user);
        }

        sqlSession.close();
        inputStream.close();

    }
}
