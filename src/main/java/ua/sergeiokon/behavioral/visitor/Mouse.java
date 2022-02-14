package ua.sergeiokon.behavioral.visitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
