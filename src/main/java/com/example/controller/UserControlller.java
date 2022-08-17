package com.example.controller;

import com.example.model.Users;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserControlller {

    @Autowired
    private UserRepository repository;

    @GetMapping("/user/{userId}")
    public Users findUserDeails(@PathVariable final Integer userId){
        return this.repository.findById(userId).get();
    }

}
