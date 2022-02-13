package com.poli.bookingservice.entity;

import lombok.*;

import javax.persistence.Id;
import java.util.ArrayList;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
public class Booking {
    @NonNull
    @Id
    private Long id;
    @NonNull
    private Long userid;
    @NonNull
    private Long showtimeid;
    private ArrayList<Object> movies;

}
