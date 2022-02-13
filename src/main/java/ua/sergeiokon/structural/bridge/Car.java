package ua.sergeiokon.structural.bridge;

public abstract class Car {

    public Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    abstract void showDetails();
}

