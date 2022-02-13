package ua.sergeiokon.structural.flyweight;

public class Square implements Shape {
    int side = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ":" + y + ")" + " Drawing Square" + " + side " + side);
    }
}
