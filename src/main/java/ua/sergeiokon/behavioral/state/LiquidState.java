package ua.sergeiokon.behavioral.state;

public class LiquidState implements State{

    @Override
    public void changeState(Water water) {
        System.out.println("Water in Liquid state");
        water.setState(this);
    }

    @Override
    public String toString() {
        return "It can be dew......";
    }
}
