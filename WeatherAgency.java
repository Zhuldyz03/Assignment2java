package com.company;

public class WeatherAgency implements Observer {

    @Override
    public void update(int temperature) {

        System.out.println("News Paper Agency gets current temperature as: "
                + temperature + " degrees");

    }

}
