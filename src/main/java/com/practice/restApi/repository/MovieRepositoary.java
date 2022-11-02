package com.practice.restApi.repository;

import com.practice.restApi.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositoary extends CrudRepository<Movie,Integer> {
}
