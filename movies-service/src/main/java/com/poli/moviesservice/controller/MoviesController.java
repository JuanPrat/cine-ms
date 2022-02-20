package com.poli.moviesservice.controller;

import com.poli.moviesservice.entity.Movie;
import com.poli.moviesservice.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    MoviesService moviesService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return moviesService.getAllMovies();
    }

    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie){
        return moviesService.saveMovie(movie);
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return moviesService.getMovieById(id);
    }

    @DeleteMapping("/movies/{id}")
    public Long deleteMovieById(@PathVariable Long id){
        return moviesService.deleteMovieById(id);
    }
}
