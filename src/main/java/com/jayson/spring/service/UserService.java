package com.jayson.spring.service;

import com.jayson.spring.model.User;
import com.jayson.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> listOfUser() {
        return userRepository.findAll();
    }
}
