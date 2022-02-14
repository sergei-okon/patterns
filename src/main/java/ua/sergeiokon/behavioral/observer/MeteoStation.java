package ua.sergeiokon.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(temperature);
        }
    }
}
