package ua.sergeiokon.behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();

        computerPart.accept(new Report());
    }
}
