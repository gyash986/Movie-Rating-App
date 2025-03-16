package com.example.Movie_Service.movie_app.Repository;

import com.example.Movie_Service.movie_app.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  MovieRepository extends JpaRepository<Movie,Long> {

}
