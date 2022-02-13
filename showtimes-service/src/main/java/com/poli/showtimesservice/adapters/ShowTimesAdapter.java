package com.poli.showtimesservice.adapters;

import com.poli.showtimesservice.contracts.ShowTimesInterface;
import com.poli.showtimesservice.entity.ShowTime;
import com.poli.showtimesservice.repository.ShowTimesRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Repository
public class ShowTimesAdapter implements ShowTimesInterface {

    ShowTimesRepository showTimesRepository;

    @Override
    public List<ShowTime> findAll() {
        return showTimesRepository.findAll();
    }

    @Override
    public ShowTime saveShowTime(ShowTime showTime) {
        return showTimesRepository.save(showTime);
    }

    @Override
    public ShowTime getShowTimeById(Long id) {
        return showTimesRepository.findById(id).orElse(new ShowTime());
    }

    @Override
    public ShowTime updateShowTime(ShowTime showTime) {
        return showTimesRepository.save(showTime);
    }
}
