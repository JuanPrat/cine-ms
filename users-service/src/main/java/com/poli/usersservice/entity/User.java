package com.poli.usersservice.entity;

import com.sun.istack.NotNull;

import javax.persistence.Id;

public class User {
    @Id
    @NotNull
    Long id;
    @NotNull
    String name;
    @NotNull
    String lastName;
}
