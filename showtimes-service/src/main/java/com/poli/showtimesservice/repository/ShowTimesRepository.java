package com.poli.showtimesservice.repository;

import com.poli.showtimesservice.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimesRepository extends JpaRepository<ShowTime, Long> {
}
