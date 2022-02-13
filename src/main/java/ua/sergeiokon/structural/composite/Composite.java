package ua.sergeiokon.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {

    List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape shape) {
        shapes.add(shape);
    }

    public void removeShapes(Shape shape) {
        shapes.remove(shape);
    }

    public void draw() {
        shapes.forEach(Shape::draw);
    }
}

