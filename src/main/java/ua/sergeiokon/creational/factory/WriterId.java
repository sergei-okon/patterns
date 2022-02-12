package ua.sergeiokon.creational.factory;

public class WriterId implements Id {

    @Override
    public void getLastId() {
        System.out.println("Get last WriterId from Json file");
    }
}
