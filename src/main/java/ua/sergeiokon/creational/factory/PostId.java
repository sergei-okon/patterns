package ua.sergeiokon.creational.factory;

public class PostId implements Id {

    @Override
    public void getLastId() {
        System.out.println("Get last PostId from Json file");
    }
}
