package com.poli.bookingservice.service;

import com.poli.bookingservice.BookingServiceApplication;
import com.poli.bookingservice.contracts.BookingInterface;
import com.poli.bookingservice.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingInterface bookingInterface;

    public List<Booking> getBookings() {return bookingInterface.getBookings() ;}

    public Booking saveBooking(Booking booking) {return bookingInterface.saveBooking(booking);}

    public Booking getBookingById(Long id) {
        return bookingInterface.getBookingById(id);
    }

    public Long deleteBooking(Long id) {
        return bookingInterface.deleteBooking(id);
    }

    public Booking getBookingByUserId(Long userId) {
        return bookingInterface.getBookingByUserId(userId);
    }
}
