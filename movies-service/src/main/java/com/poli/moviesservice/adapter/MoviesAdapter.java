package com.poli.moviesservice.adapter;

import com.poli.moviesservice.contracts.MoviesInterface;
import com.poli.moviesservice.entity.Movie;
import com.poli.moviesservice.repository.MoviesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MoviesAdapter implements MoviesInterface {
    @Autowired
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
