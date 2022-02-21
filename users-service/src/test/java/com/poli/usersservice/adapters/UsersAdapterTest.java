package com.poli.usersservice.adapters;

import com.poli.usersservice.entity.User;
import com.poli.usersservice.repository.UsersRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;

class UsersAdapterTest {

    @Mock
    UsersAdapter usersAdapterUnderTest;
    @Mock
    UsersRepository usersRepositoryMock;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        usersAdapterUnderTest = new UsersAdapter(usersRepositoryMock);
    }

    @Test
    void findAll() {
        User user = new User();
        User user2 = new User();
        User user3 = new User();
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user);
        listUsers.add(user2);
        listUsers.add(user3);
        Mockito.when(usersRepositoryMock.findAll()).thenReturn(listUsers);
        List result = usersAdapterUnderTest.findAll();
        Assert.assertEquals(result.size(), listUsers.size());
    }

    @Test
    void saveUser() {
        User userToSave = User.builder().id(1L).build();
        Mockito.when(usersRepositoryMock.save(userToSave)).thenReturn(userToSave);
        User resultado = usersAdapterUnderTest.saveUser(userToSave);
        Assert.assertEquals(userToSave.getId(), resultado.getId());
    }

    @Test
    void deleteUser() {
        User userToDelete = User.builder().id(1L).build();
        Long resultado = usersAdapterUnderTest.deleteUser(userToDelete.getId());
        Mockito.verify(usersRepositoryMock, times(1)).deleteById(userToDelete.getId());
        Assert.assertEquals(userToDelete.getId(), resultado);
    }
}