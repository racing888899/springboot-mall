package com.ricky.springbootmall.service.impl;

import com.ricky.springbootmall.dao.UserDao;
import com.ricky.springbootmall.dto.UserRegisterRequest;
import com.ricky.springbootmall.model.User;
import com.ricky.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
