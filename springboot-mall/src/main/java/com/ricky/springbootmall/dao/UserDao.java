package com.ricky.springbootmall.dao;

import com.ricky.springbootmall.dto.UserRegisterRequest;
import com.ricky.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
