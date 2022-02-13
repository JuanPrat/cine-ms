package com.poli.showtimesservice.contracts;

import com.poli.showtimesservice.entity.ShowTime;

import java.util.List;

public interface ShowTimesInterface {

    List<ShowTime> findAll();
    ShowTime saveShowTime(ShowTime showTime);
    ShowTime getShowTimeById(Long id);
    ShowTime updateShowTime(ShowTime showTime);



}
