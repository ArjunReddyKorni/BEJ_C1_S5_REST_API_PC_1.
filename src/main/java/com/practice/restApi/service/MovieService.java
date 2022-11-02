package com.practice.restApi.service;

import com.practice.restApi.domain.Movie;

import java.util.List;

public interface MovieService {

    Movie addMovie(Movie movie);
    List<Movie> getAllMovies();
}
