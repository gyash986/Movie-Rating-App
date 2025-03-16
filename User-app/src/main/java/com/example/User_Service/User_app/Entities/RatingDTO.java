package com.example.User_Service.User_app.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RatingDTO {
    private Long id;
    private Long movieId;
    private Long userId;
    private Double rating;
}
