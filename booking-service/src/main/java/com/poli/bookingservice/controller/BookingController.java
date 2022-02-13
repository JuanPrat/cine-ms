package com.poli.bookingservice.controller;

import com.poli.bookingservice.entity.Booking;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RestController
public class BookingController {

    @GetMapping("/bookings")
    public ArrayList<Booking> getBookings(){
        return null;
    }

    @PostMapping("bookings")
    public Booking saveBooking(@RequestBody Booking booking){
        return null;
    }

    @GetMapping("/bookings/{id}")
    public Booking getBookingById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/bookings/{id}")
    public Booking deleteBookingById(@PathVariable Long id){
        return null;
    }

    @GetMapping("/bookings/{userId}")
    public Booking getBookingByUserId(@PathVariable Long id){
        return null;
    }
}
