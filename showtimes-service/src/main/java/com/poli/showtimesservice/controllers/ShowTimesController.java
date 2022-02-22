package com.poli.showtimesservice.controllers;

import com.poli.showtimesservice.entity.ShowTime;
import com.poli.showtimesservice.service.ShowTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowTimesController {
    @Autowired
    ShowTimesService showTimesService;

    @GetMapping("/showtimes")
    public List<ShowTime> getAllShowtimes(){
        return showTimesService.findAll();
    }

    @PostMapping("/showtimes")
    public ShowTime saveShowTime(@RequestBody ShowTime showTime){
        return showTimesService.saveShowTime(showTime);
    }

    @GetMapping("/showtimes/{id}")
    public ShowTime getShowTimeById(@PathVariable Long id){
        return showTimesService.getShowTimeById(id);
    }

    @PutMapping("/showtimes")
    public ShowTime updateShowTimeById(@RequestBody ShowTime showTime){
        return showTimesService.updateShowTime(showTime);
    }
}
