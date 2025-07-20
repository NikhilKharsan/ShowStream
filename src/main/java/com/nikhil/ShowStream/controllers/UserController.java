package com.nikhil.ShowStream.controllers;

import com.nikhil.ShowStream.dtos.UserRequestDto;
import com.nikhil.ShowStream.models.User;
import com.nikhil.ShowStream.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User signup(UserRequestDto requestDto) {
        // TODO: ADd try catch block
        return userService.signUp(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassowrd());
    }
}
