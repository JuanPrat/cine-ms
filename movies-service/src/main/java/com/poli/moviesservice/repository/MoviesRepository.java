package com.poli.moviesservice.repository;

import com.poli.moviesservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movie,Long > {
}
