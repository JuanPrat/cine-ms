package com.poli.usersservice.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @NotNull
    Long id;
    @NotNull
    String name;
    @NotNull
    String lastName;
}
