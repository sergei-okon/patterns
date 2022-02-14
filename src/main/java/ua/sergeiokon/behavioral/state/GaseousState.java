package ua.sergeiokon.behavioral.state;

public class GaseousState implements State {

    @Override
    public void changeState(Water water) {
        System.out.println("Water in gaseous state");
        water.setState(this);
    }

    @Override
    public String toString() {
        return "It can be steam......";
    }
}
