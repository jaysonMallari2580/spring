package com.jayson.spring.restcontroller;

import com.jayson.spring.model.User;
import com.jayson.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    //@CrossOrigin(origins = "http://localhost:4200/")
    //only works on Spring version under  2
    Collection<User> listOfUsers(){
        return userService.listOfUser();
    }
}
