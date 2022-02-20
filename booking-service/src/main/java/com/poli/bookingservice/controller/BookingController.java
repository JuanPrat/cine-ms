package com.poli.bookingservice.controller;

import com.poli.bookingservice.entity.Booking;
import com.poli.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping("/bookings")
    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }

    @PostMapping("/bookings")
    public Booking saveBooking(@RequestBody Booking booking){
        return bookingService.saveBooking(booking);
    }

    @GetMapping("/bookings/byId/{id}")
    public Booking getBookingById(@RequestParam Long id){
        return bookingService.getBookingById(id);
    }

    @DeleteMapping("/bookings/{id}")
    public Long deleteBookingById(@RequestParam Long id){return bookingService.deleteBooking(id);}

    @GetMapping("/bookings/{userId}")
    public Booking getBookingByUserId(@RequestParam Long userId){
        return bookingService.getBookingByUserId(userId);
    }
}
