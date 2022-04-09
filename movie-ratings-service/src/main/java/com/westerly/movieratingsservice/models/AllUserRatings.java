package com.westerly.movieratingsservice.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllUserRatings {
    private List<UserRating> allUserRatings =new ArrayList<UserRating>();

    public UserRating findUserRatingByUserId(String userId){
        int id = Integer.parseInt(userId);  
        return allUserRatings.get(id);
    }

    public void initData() {
        List<Rating> newRatings;
        UserRating newUserRating;
        
        newUserRating = new UserRating("0", Arrays.asList());
        this.allUserRatings.add(newUserRating);
        
        newRatings = Arrays.asList(
            new Rating("123", 3),
            new Rating("343", 4));
        newUserRating = new UserRating("1", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("100", 2),
            new Rating("237", 8),
            new Rating("878", 9),
            new Rating("987", 7));
            
        newUserRating = new UserRating("2", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("767", 7),
            new Rating("349", 6),
            new Rating("457", 5));
        newUserRating = new UserRating("3", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("312", 9),
            new Rating("909", 2));
        newUserRating = new UserRating("4", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("1000", 7),
            new Rating("9898", 8));
        newUserRating = new UserRating("5", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("8784", 3),
            new Rating("9835", 4));
        newUserRating = new UserRating("6", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("986", 2),
            new Rating("21354", 9));
        newUserRating = new UserRating("7", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("676", 7),
            new Rating("8979", 5));
        newUserRating = new UserRating("8", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("567", 9),
            new Rating("8768", 5));
        newUserRating = new UserRating("9", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("5646", 2),
            new Rating("5747", 4));
        newUserRating = new UserRating("10", newRatings);
        this.allUserRatings.add(newUserRating);
        newRatings = Arrays.asList(
            new Rating("8", 4),
            new Rating("8777", 7));
        newUserRating = new UserRating("11", newRatings);
        this.allUserRatings.add(newUserRating);
        

        
    }
}