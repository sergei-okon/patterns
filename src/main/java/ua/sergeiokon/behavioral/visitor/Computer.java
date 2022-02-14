package ua.sergeiokon.behavioral.visitor;

public class Computer implements ComputerPart {

    private ComputerPart[] computerParts = new ComputerPart[]{new Mouse(), new Printer(), new Keyboard()};

    @Override
    public void accept(Visitor visitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
