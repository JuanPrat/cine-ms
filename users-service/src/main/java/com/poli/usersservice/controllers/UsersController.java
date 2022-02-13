package com.poli.usersservice.controllers;

import com.poli.usersservice.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UsersController {

    @GetMapping("/users")
    public ArrayList<User> getAllUsers(){
        return null;
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return null;
    }

    @DeleteMapping("/users/{id}")
    public User deleteUserById(@PathVariable Long id){
        return null;
    }


}
