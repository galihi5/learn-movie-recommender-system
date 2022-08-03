package com.gaw.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie) {
//        implement logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
