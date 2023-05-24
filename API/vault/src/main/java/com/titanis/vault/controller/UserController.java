package com.titanis.vault.controller;

import com.titanis.vault.model.User;
import com.titanis.vault.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/all")
    public List<User> GetAllUsers(){
        return userRepository.findAll();
    }
    @PostMapping("/user/new")
    public void CreateUser(@RequestBody User user){
        if(user.Email!=null)
            userRepository.save(user);
    }
}
