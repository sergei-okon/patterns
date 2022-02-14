package ua.sergeiokon.behavioral.visitor;

public interface Visitor {

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Printer printer);

    void visit(Computer computer);
}
