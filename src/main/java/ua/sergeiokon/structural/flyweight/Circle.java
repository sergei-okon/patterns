package ua.sergeiokon.structural.flyweight;

public class Circle implements Shape {
    int radius = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ":" + y + ")" + " Drawing Circle" + " + radius " + radius);
    }
}
