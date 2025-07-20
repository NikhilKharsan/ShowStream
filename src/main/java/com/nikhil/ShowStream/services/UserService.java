package com.nikhil.ShowStream.services;

import com.nikhil.ShowStream.models.User;
import com.nikhil.ShowStream.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String name, String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()) {
            throw new RuntimeException(); // TODO: Add custom exception
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        return userRepository.save(user);
    }
}
