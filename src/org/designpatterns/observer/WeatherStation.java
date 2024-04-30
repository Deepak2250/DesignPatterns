package org.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
    float temp;
    float weatherSpeed;
    List<Observer> observers;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }


    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMe() {
        for(Observer observer : observers){
            observer.update();
            System.out.println(observer);
        }
    }

    @Override
    public void getAll() {
        for (Observer observer : observers){
            System.out.println(observer.getClass().getSimpleName());
        }
    }

    public void set(float temp , float weatherSpeed) {
        this.temp = temp;
        this.weatherSpeed = weatherSpeed;
        notifyMe();
    }

    public float getTemp() {
        return temp;
    }


    public float getWeatherSpeed() {
        return weatherSpeed;
    }

}
