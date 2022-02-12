package ua.sergeiokon.creational.abstractfactory;

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Paint Windows checkbox...");
    }
}
