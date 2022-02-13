package ua.sergeiokon.structural.bridge;

public class Hatchback extends Car{

    public Hatchback(Brand brand) {
        super(brand);
    }

    @Override
    void showDetails() {
        brand.setBrand();
        System.out.println("Hatchback");
    }
}
