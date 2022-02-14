package ua.sergeiokon.behavioral.observer;

public class MeteoApp implements Observer{

    @Override
    public void handleEvent(int temperature) {
        System.out.println("Report to MeteoApp.Temperature changed. Now temperature is: " + temperature);
    }
}
