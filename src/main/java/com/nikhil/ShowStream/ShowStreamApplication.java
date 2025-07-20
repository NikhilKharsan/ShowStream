package com.nikhil.ShowStream;

import com.nikhil.ShowStream.controllers.UserController;
import com.nikhil.ShowStream.dtos.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShowStreamApplication implements CommandLineRunner {
    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(ShowStreamApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setName("dhananjay");
        userRequestDto.setEmail("dhananjay@gmail.com");
        userRequestDto.setPassowrd("password");

        userController.signup(userRequestDto);
    }
}
