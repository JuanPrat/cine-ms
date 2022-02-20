package com.poli.moviesservice.service;

import com.poli.moviesservice.contracts.MoviesInterface;
import com.poli.moviesservice.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService  {

    @Autowired
    MoviesInterface moviesInterface;

    public List<Movie> getAllMovies() {
        return moviesInterface.getAllMovies();
    }


    public Movie saveMovie(Movie movie) {
        return moviesInterface.saveMovie(movie);
    }


    public Movie getMovieById(Long id) {
        return moviesInterface.getMovieById(id);
    }


    public Long deleteMovieById(Long id) {
        return moviesInterface.deleteMovieById(id);
    }
}
