package ua.sergeiokon.behavioral.visitor;

public class Printer implements ComputerPart {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}