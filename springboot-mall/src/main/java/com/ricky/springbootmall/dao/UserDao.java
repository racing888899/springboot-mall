package com.ricky.springbootmall.dao;

import com.ricky.springbootmall.dto.UserRegisterRequest;
import com.ricky.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
