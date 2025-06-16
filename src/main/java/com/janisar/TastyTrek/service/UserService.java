package com.janisar.TastyTrek.service;

import com.janisar.TastyTrek.io.UserRequest;
import com.janisar.TastyTrek.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
