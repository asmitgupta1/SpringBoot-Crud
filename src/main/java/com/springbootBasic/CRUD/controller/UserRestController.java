package com.springbootBasic.CRUD.controller;


import com.springbootBasic.CRUD.model.User;
import com.springbootBasic.CRUD.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);



    @GetMapping("/getUserDetails")
    public List<User> getUserDetails()
    {
        return userRepo.findAll();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
