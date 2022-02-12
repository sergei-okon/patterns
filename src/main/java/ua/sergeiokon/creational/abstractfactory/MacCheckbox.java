package ua.sergeiokon.creational.abstractfactory;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Paint Mac checkbox...");
    }
}
