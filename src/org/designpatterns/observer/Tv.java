package org.designpatterns.observer;


public class Tv implements Observer{

    float temp;
    float weatherSpeed;

    WeatherStation weatherStation;

    public Tv(WeatherStation weatherStation){
        this.weatherStation = weatherStation;

    }
    @Override
    public void update() {
        this.temp = weatherStation.getTemp();
        this.weatherSpeed = weatherStation.getWeatherSpeed();
    }

    @Override
    public void display() {
        System.out.println("The Temp is : "+temp);
        System.out.println("The Weather Speed is : "+weatherSpeed);
    }

}

