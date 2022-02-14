package ua.sergeiokon.behavioral.state;

public class SolidState implements State {

    @Override
    public void changeState(Water water) {
        System.out.println("Water in solid state");
        water.setState(this);
    }

    @Override
    public String toString() {
        return "It can be ice......";
    }
}
