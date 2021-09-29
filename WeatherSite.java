package com.company;

public class WeatherSite implements Observer {

    @Override
    public void update(int temperature) {

        System.out.println("Weather Information Site gets current temperature as: "
                + temperature + " degrees");

    }
}
