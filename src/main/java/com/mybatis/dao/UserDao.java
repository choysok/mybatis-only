package com.mybatis.dao;

import com.mybatis.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

}
