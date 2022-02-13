package com.poli.showtimesservice.controllers;

import com.poli.showtimesservice.entity.ShowTime;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ShowTimesController {

    @GetMapping("/showtimes")
    public ArrayList<ShowTime> getAllShowtimes(){
        return null;
    }

    @PostMapping("/showtimes")
    public ShowTime saveShowTime(@RequestBody ShowTime showTime){
        return null;
    }

    @GetMapping("/showtimes/{id}")
    public ShowTime getShowTimeById(@PathVariable Long id){
        return null;
    }

    @PutMapping("/showtimes/{id}")
    public ShowTime updateShowTimeById(@PathVariable Long id){
        return null;
    }
}
