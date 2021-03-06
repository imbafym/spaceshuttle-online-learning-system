package com.example.springsecurity.controller;



import com.example.springsecurity.model.User;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping("/all")
    public List<User> all(){
        return Arrays.asList(new User("Frank", "123"),new User("Alice","321"));
    }


    @GetMapping("/me")
    public Object me(){
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
