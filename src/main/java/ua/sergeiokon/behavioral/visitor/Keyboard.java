package ua.sergeiokon.behavioral.visitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}