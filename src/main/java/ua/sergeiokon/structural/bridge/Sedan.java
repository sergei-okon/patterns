package ua.sergeiokon.structural.bridge;

public class Sedan extends Car {


    public Sedan(Brand brand) {
        super(brand);
    }

    @Override
    void showDetails() {
        brand.setBrand();
        System.out.println("Sedan");
    }
}
