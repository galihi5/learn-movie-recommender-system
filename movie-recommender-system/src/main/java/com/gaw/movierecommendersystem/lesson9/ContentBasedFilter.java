package com.gaw.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{
    private static int instances = 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        super();
        instances++;
        System.out.println("ContentBasedFilter Constructor called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
