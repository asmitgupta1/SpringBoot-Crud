package com.springbootBasic.CRUD.controller;


import com.springbootBasic.CRUD.model.User;
import com.springbootBasic.CRUD.repo.UserRepo;
import com.springbootBasic.CRUD.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
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

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);



    @GetMapping("/getUserDetails")
    public List<User> getUserDetails()
    {
        return userRepo.findAll();
    }

    @PostMapping("/register")
    public User register(@RequestBody User user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername());
        }
        return "Login Failed";
    }
}
