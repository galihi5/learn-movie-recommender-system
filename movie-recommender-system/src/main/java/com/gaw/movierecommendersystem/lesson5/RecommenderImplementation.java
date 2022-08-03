package com.gaw.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class RecommenderImplementation {
    //Filter is a dependency of RecommenderImplementation
    @Autowired
    private Filter contentBasedFilter;

    // use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implemenattion being used
        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");

        return results;
    }
}
