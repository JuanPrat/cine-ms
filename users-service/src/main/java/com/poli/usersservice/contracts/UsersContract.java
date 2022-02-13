package com.poli.usersservice.contracts;

import com.poli.usersservice.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersContract {

    List<User> findAll();
    User saveUser(User user);
    Long deleteUser(Long user);

}
