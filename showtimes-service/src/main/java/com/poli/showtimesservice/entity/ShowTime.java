package com.poli.showtimesservice.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Not null")
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull(message = "Not null")
    private Date date;

    private ArrayList<Object> movies;
}
