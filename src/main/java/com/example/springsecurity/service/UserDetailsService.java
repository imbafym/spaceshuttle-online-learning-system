package com.example.springsecurity.service;

import com.example.springsecurity.model.User;
import com.example.springsecurity.model.UserDetailsImpl;
import com.example.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String email)  {


        User user = userRepository.findUserByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException(email);
        }


        return new UserDetailsImpl(user);
    }
}
