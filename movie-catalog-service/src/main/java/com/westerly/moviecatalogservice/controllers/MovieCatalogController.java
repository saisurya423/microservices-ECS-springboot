package com.westerly.moviecatalogservice.controllers;

import com.westerly.moviecatalogservice.models.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
   
    @Autowired
    RestTemplate restTemplate;

    @Value("${MOVIE_INFO_SERVICE}")
    private String movieInforService;

    @GetMapping("/{userId}")
    public String home() {
        // Movie movie = restTemplate.getForObject(
        //     "http://"+movieInforService+"/movie/2", Movie.class);
        return movieInforService;
    }
}
