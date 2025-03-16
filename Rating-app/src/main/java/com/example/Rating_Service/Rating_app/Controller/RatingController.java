package com.example.Rating_Service.Rating_app.Controller;

import com.example.Rating_Service.Rating_app.Entities.Rating;
import com.example.Rating_Service.Rating_app.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService service;

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(service.getRating(id));
    }

    @PostMapping
    public ResponseEntity<Rating> createMovie(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveRating(rating));
    }
}
