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
    Long id;
    @NonNull
    Long userid;
    @NonNull
    Long showtimeid;
    ArrayList<Object> movies;

}
