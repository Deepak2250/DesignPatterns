package org.designpatterns.observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyMe();
    void getAll();
}

