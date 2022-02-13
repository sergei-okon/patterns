package ua.sergeiokon.structural.bridge;

public class CarCreator {

    public static void main(String[] args) {
        Car car = new Hatchback(new Kia());
        car.showDetails();
    }
}
