package ua.sergeiokon.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        TVForecast tvForecast = new TVForecast();
        MeteoApp meteoApp = new MeteoApp();

        meteoStation.addObserver(tvForecast);
        meteoStation.addObserver(meteoApp);

        meteoStation.setTemperature(25);
        System.out.println("===================================================");
        meteoStation.setTemperature(15);
    }
}
