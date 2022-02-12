package ua.sergeiokon.creational.factory;

public class WriterIdFactory implements IdFactory {

    @Override
    public Id createId() {
        return new WriterId();
    }
}
