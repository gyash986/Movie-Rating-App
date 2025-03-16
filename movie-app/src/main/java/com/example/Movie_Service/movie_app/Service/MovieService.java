package com.example.Movie_Service.movie_app.Service;

import com.example.Movie_Service.movie_app.Repository.MovieRepository;
import com.example.Movie_Service.movie_app.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public Movie getMovie(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

}
