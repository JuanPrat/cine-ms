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
public class UsersService {

    @Autowired
    BookingClient bookingClient;

    @Autowired
    private UsersContract usersContract;


    public List<User> findAll() {
        return usersContract.findAll();
    }


    public User saveUser(User user) {
        return usersContract.saveUser(user);
    }


    public Long deleteUser(Long id) {
        List bookings = (List)bookingClient.getBookingByUserId(id).getBody();
        if(bookings.size() > 0){
            return null;
        }
        else {
            return usersContract.deleteUser(id);
        }
    }
}
