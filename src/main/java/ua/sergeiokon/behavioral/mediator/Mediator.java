package ua.sergeiokon.behavioral.mediator;

public abstract class Mediator {

    public abstract void send(String message, Colleague sender);
}