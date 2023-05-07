package com.ricky.springbootmall.service;

import com.ricky.springbootmall.dto.UserRegisterRequest;
import com.ricky.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
