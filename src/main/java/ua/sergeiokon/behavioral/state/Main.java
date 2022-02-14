package ua.sergeiokon.behavioral.state;

public class Main {

    public static void main(String[] args) {
        Water water = new Water();

        SolidState solidState = new SolidState();
        solidState.changeState(water);
        System.out.println(water.getState().toString());

        LiquidState liquidState = new LiquidState();
        liquidState.changeState(water);
        System.out.println(water.getState().toString());

        GaseousState gaseousState = new GaseousState();
        gaseousState.changeState(water);
        System.out.println(water.getState().toString());

    }
}
