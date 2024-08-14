package com.springbootBasic.CRUD.service;


import com.springbootBasic.CRUD.model.User;
import com.springbootBasic.CRUD.model.UserPrincipal;
import com.springbootBasic.CRUD.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService  implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =  userRepo.findByUsername(username);
        System.out.println(username);
        if(user == null)
        {
            System.out.println("user not found");
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }
}
