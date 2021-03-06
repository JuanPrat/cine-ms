package com.poli.usersservice.service;

import com.poli.usersservice.client.BookingClient;
import com.poli.usersservice.contracts.UsersContract;
import com.poli.usersservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {

    @Autowired
    private BookingClient bookingClient;

    @Autowired
    private UsersContract usersContract;

    public List<User> findAll() {
        return usersContract.findAll();
    }


    public User saveUser(User user) {
        return usersContract.saveUser(user);
    }


    public Long deleteUser(Long id) {
            return usersContract.deleteUser(id);
    }
}
