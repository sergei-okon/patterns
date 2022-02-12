package ua.sergeiokon.creational.factory;

public class PostIdFactory implements IdFactory{

    @Override
    public Id createId() {
        return new PostId();
    }
}
