package com.example.User_Service.User_app.Entities;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RatingDTO {

    private Long id;

    private Long movieId;
    private Double rating;
}
