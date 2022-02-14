package ua.sergeiokon.behavioral.observer;

public class TVForecast implements Observer {

    @Override
    public void handleEvent(int temperature) {
        System.out.println("Report to TV forecast.Temperature changed. Now temperature is: " + temperature);
    }
}
