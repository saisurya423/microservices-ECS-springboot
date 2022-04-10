package com.westerly.movieratingsservice.controllers;

import javax.servlet.http.HttpServletRequest;

import com.westerly.movieratingsservice.models.AllUserRatings;
import com.westerly.movieratingsservice.models.Rating;
import com.westerly.movieratingsservice.models.UserRating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class MovieRatingsController {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }
    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        AllUserRatings allUserRatings = new AllUserRatings();
        allUserRatings.initData();       
        return allUserRatings.findUserRatingByUserId(userId);

    }
    @GetMapping("/host-info") 
    public String getHostHeader(HttpServletRequest request){
        return request.getHeader("host");
    }
}
