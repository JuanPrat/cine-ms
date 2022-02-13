package com.poli.moviesservice.controller;

import com.poli.moviesservice.entity.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MoviesController {

    @GetMapping("/movies")
    public ArrayList<Movie> getAllMovies(){
        return null;
    }

    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie){
        return null;
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/movies/{id}")
    public Movie deleteMovieById(@PathVariable Long id){
        return null;
    }
}
