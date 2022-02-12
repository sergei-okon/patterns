package ua.sergeiokon.creational.abstractfactory;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Paint Mac button...");
    }
}
