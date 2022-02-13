package com.poli.bookingservice.contracts;

import com.poli.bookingservice.entity.Booking;

import java.util.List;

public interface BookingInterface {

    List<Booking> getBookings();
    Booking saveBooking(Booking booking);
    Booking getBookingById(Long id);
    Long deleteBooking(Long id);
    Booking getBookingByUserId(Long userId);

}
