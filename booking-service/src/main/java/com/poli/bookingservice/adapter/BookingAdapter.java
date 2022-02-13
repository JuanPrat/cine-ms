package com.poli.bookingservice.adapter;

import com.poli.bookingservice.contracts.BookingInterface;
import com.poli.bookingservice.entity.Booking;
import com.poli.bookingservice.repository.BookingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingAdapter implements BookingInterface {

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
        return bookingRepository.getById(id);
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
