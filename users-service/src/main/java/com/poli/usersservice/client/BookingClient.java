package com.poli.usersservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "booking-service")
public interface BookingClient {
    @GetMapping("/store/v1/bookings/{userId}")
    ResponseEntity getBookingByUserId(@PathVariable("userId") Long numberId);

}
