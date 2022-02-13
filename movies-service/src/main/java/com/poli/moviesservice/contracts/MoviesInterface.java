package com.poli.moviesservice.contracts;

import com.poli.moviesservice.entity.Movie;

import java.util.List;

public interface MoviesInterface {

    List<Movie> getAllMovies();

    Movie saveMovie(Movie movie);

    Movie getMovieById(Long id);

    Long deleteMovieById(Long id);

}
