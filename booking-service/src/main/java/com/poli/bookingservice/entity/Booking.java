package com.poli.bookingservice.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @NotNull(message = "Not null")
    private Long userId;

    @NotNull(message = "Not null")
    private Long showtimeId;

    private ArrayList<Object> movies;
}
