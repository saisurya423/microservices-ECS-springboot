package com.westerly.moviecatalogservice.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import com.westerly.moviecatalogservice.models.CatalogItem;
import com.westerly.moviecatalogservice.models.Movie;
import com.westerly.moviecatalogservice.models.UserRating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
   
    @Autowired
    RestTemplate restTemplate;

    @Value("${MOVIE_INFO_SERVICE}")
    private String movieInfoService;
    @Value("${MOVIE_RATINGS_SERVICE}")
    private String movieRatingsService;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        UserRating userRating = restTemplate.getForObject("http://"+movieRatingsService+"/ratingsdata/user/" + userId,
                UserRating.class);
        return userRating.getRatings().stream().map(
                rating -> {
                    Movie movie = restTemplate.getForObject(
                        "http://"+movieInfoService+"/movie/" + rating.getMovieId(), Movie.class);
                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
                }).collect(Collectors.toList());
    } 
    @GetMapping("/host-info") 
    public String getHostHeader(HttpServletRequest request){
        return request.getHeader("host");
    }
    @GetMapping("/info-service-host") 
    public String getInfoServiceHostHeader(){
        return restTemplate.getForObject(
            "http://"+movieInfoService+"/host-info", String.class);
    }
    @GetMapping("/ratings-service-host") 
    public String getRatingsServiceHostHeader(){
        return restTemplate.getForObject(
            "http://"+movieRatingsService+"/ratingsdata/host-info", String.class);
    }
}
