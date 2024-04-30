package org.designpatterns.observer;


public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Tv tv = new Tv(weatherStation);
        PhoneObserver phoneObserver = new PhoneObserver(weatherStation);
        weatherStation.add(tv);
        weatherStation.add(phoneObserver);
        weatherStation.set(130 , 230);
        tv.display();
        phoneObserver.display();
        weatherStation.getAll();
    }
}

