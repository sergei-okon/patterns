package ua.sergeiokon.behavioral.visitor;

public class Report implements Visitor {

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse: Logi M590");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard Logitech 341");
    }

    @Override
    public void visit(Printer printer) {
        System.out.println("Printer: Xerox311");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer: Asus 4589");
    }
}
