package com.example.User_Service.User_app.Client;

import com.example.User_Service.User_app.Entities.RatingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "rating-service")
public interface RatingServiceClient {
    @GetMapping("/ratings/user/{userId}")
    List<RatingDTO> getRatings(@PathVariable Long userId);
}
