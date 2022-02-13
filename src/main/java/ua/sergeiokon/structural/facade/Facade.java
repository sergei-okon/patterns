package ua.sergeiokon.structural.facade;

public class Facade {

    Shape circle;
    Shape square;
    Shape triangle;
    Composite composite;

    public Facade() {
        this.circle = new Circle();
        this.square = new Square();
        this.triangle = new Triangle();
        this.composite = new Composite();
    }

    public void drawAllShades() {
        composite.addShapes(circle);
        composite.addShapes(square);
        composite.addShapes(triangle);

        composite.draw();
    }
}
