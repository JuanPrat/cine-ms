package com.poli.moviesservice.adapter;

import com.poli.moviesservice.contracts.MoviesInterface;
import com.poli.moviesservice.entity.Movie;
import com.poli.moviesservice.repository.MoviesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MoviesAdapter implements MoviesInterface {

    MoviesRepository moviesRepository;

    @Override
    public List<Movie> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public Movie getMovieById(Long id) {
        return moviesRepository.getOne(id);
    }

    @Override
    public Long deleteMovieById(Long id) {
         moviesRepository.deleteById(id);
         return id;
    }
}
