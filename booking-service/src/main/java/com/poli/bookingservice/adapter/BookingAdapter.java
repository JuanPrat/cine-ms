package com.poli.bookingservice.adapter;

import com.netflix.discovery.converters.Auto;
import com.poli.bookingservice.contracts.BookingInterface;
import com.poli.bookingservice.entity.Booking;
import com.poli.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public class BookingAdapter implements BookingInterface {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public Long deleteBooking(Long id) {
        bookingRepository.deleteById(id);
        return id;
    }

    @Override
    public Booking getBookingByUserId(Long userId) {
        return bookingRepository.deleteByUserId(userId);
    }
}
