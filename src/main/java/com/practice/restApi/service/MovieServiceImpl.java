package com.practice.restApi.service;

import com.practice.restApi.domain.Movie;
import com.practice.restApi.repository.MovieRepositoary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{


    MovieRepositoary movieRepositoary;

    @Autowired
    public MovieServiceImpl(MovieRepositoary movieRepositoary) {
        this.movieRepositoary = movieRepositoary;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepositoary.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>)movieRepositoary.findAll();
    }
}
