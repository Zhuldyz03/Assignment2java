package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WeatherBroadcast weatherBroadcast = new WeatherBroadcast();


        Observer weatherChannel = new WeatherChannel();
        Observer weatherSite = new WeatherSite();
        Observer weatherAgency = new WeatherAgency();


        weatherBroadcast.addObserver(weatherChannel);
        weatherBroadcast.addObserver(weatherSite);
        weatherBroadcast.addObserver(weatherAgency);

        System.out.println("\nNow the temperature shows 20 degrees\n");

        weatherBroadcast.temperatureChanged(20);

        System.out.println("\nAfter 5 minutes temperature changes to 22 degrees\n");


        weatherBroadcast.temperatureChanged(22);

    }
}
