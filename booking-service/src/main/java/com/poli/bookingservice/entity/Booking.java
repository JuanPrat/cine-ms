package com.poli.bookingservice.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Data
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Not null")
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull(message = "Not null")
    private Long userid;

    @NotNull(message = "Not null")
    private Long showtimeid;

    private ArrayList<Object> movies;
}
