package ua.sergeiokon.behavioral.strategy;

public interface PaymentStrategy {

    void checkUserAuthentication();

    boolean execute(int cost);
}
