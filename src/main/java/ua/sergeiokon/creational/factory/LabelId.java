package ua.sergeiokon.creational.factory;

public class LabelId implements Id {

    @Override
    public void getLastId() {
        System.out.println("Get last LabelId from Json file");
    }
}
