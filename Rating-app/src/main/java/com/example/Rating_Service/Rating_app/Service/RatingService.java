package com.example.Rating_Service.Rating_app.Service;


import com.example.Rating_Service.Rating_app.Entities.Rating;
import com.example.Rating_Service.Rating_app.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public Rating getRating(Long id) {
        return ratingRepository.findById(id).orElse(null);
    }

    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }
}
