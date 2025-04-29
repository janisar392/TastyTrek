package com.janisar.TastyTrek.controller;

import com.janisar.TastyTrek.io.UserRequest;
import com.janisar.TastyTrek.io.UserResponse;
import com.janisar.TastyTrek.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request){
        return userService.registerUser(request);
    }
}
