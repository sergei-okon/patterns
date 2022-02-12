package ua.sergeiokon.creational.factory;

public class LabelIdFactory implements IdFactory {

    @Override
    public Id createId() {
        return new LabelId();
    }
}
