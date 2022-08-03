package com.gaw.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("CF")
public class CollaborativeFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie) {
//        logic for collaborative filter
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
