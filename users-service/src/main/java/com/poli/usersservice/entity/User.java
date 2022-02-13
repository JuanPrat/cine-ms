package com.poli.usersservice.entity;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class User {
    @Id
    @NotNull
    Long id;
    @NotNull
    String name;
    @NotNull
    String lastName;
}
