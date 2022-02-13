package ua.sergeiokon.structural.composite;

public class CompositeRunner {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        Composite composite = new Composite();
        composite.addShapes(circle);
        composite.addShapes(square);
        composite.addShapes(triangle);

        composite.draw();

    }
}
