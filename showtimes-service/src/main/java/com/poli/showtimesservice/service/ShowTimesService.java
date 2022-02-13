package com.poli.showtimesservice.service;

import com.poli.showtimesservice.contracts.ShowTimesInterface;
import com.poli.showtimesservice.entity.ShowTime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowTimesService{

    ShowTimesInterface showTimesInterface;

    public List<ShowTime> findAll() {
        return showTimesInterface.findAll();
    }


    public ShowTime saveShowTime(ShowTime showTime) {
        return showTimesInterface.saveShowTime(showTime);
    }


    public ShowTime getShowTimeById(Long id) {
        return showTimesInterface.getShowTimeById(id);
    }


    public ShowTime updateShowTime(ShowTime showTime) {
        return showTimesInterface.updateShowTime(showTime);
    }
}
