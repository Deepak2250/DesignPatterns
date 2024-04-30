package org.designpatterns.observer;


public class PhoneObserver implements Observer{

    float temp;
    float weatherSpeed;
    WeatherStation weatherStation;

    public PhoneObserver(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        this.weatherSpeed = weatherStation.getWeatherSpeed();
        this.temp = weatherStation.getTemp();
    }

    @Override
    public void display() {
        System.out.println("The Phone Temp is : "+temp);
        System.out.println("The Phone Weather Speed is : "+weatherSpeed);
    }
}

