package com.poli.usersservice.controllers;

import com.poli.usersservice.entity.User;
import com.poli.usersservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return usersService.findAll();
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return usersService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public Long deleteUserById(@PathVariable Long id){
        return usersService.deleteUser(id);
    }


}
