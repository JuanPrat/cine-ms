package com.poli.bookingservice.entity;

import lombok.NonNull;

import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.util.ArrayList;

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
