package com.example.demorest.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demorest.model.User;
import com.example.demorest.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}