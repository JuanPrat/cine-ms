package com.poli.bookingservice.repository;

import com.poli.bookingservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking deleteByUserId(Long userId);
    Booking findByUserId(Long userId);
}
