package com.poli.bookingservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@Data
@Entity
public class Booking {
    @NonNull
    @Id
    private Long id;
    @NonNull
    private Long userId;
    @NonNull
    private Long showtimeid;
    private ArrayList<Object> movies;

}
