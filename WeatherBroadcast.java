package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeatherBroadcast implements Observable {

    private List< Observer > Observers;
    private int temperature;

    public WeatherBroadcast() {

        Observers = new ArrayList< Observer >();
    }

    @Override
    public void addObserver(Observer observer) {

        Observers.add(observer);

    }

    @Override
    public void notifyObservers() {

        for(Observer observer : Observers) {
            observer.update(temperature);
        }

    }

    public void temperatureChanged(int newTemperature) {
        temperature = newTemperature;
        notifyObservers();
    }

}
