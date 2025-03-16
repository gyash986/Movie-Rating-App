package com.example.Rating_Service.Rating_app.Repository;

import com.example.Rating_Service.Rating_app.Entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {

}
