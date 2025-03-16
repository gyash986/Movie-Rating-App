package com.example.User_Service.User_app.Controller;

import com.example.User_Service.User_app.Client.RatingServiceClient;
import com.example.User_Service.User_app.Entities.RatingDTO;
import com.example.User_Service.User_app.Entities.User;
import com.example.User_Service.User_app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RatingServiceClient ratingServiceClient;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
    }

    @GetMapping("/{id}/ratings")
    public List<RatingDTO> getUserRatings(@PathVariable Long id) {
        return ratingServiceClient.getRatings(id);
    }
}

