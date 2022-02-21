package com.poli.usersservice.adapters;

import com.poli.usersservice.contracts.UsersContract;
import com.poli.usersservice.entity.User;
import com.poli.usersservice.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@AllArgsConstructor
public class UsersAdapter implements UsersContract {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return usersRepository.save(user);
    }

    @Override
    public Long deleteUser(Long id) {
        usersRepository.deleteById(id);
        return id;
    }
}
