package com.gaw.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

//@Component
public class CollaborativeFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
