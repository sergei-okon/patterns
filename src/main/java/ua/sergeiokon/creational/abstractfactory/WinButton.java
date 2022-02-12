package ua.sergeiokon.creational.abstractfactory;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Paint Windows button...");
    }
}
