package com.gaw.movierecommendersystem.lesson2;

public class ContentBasedFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
