package ua.sergeiokon.creational.abstractfactory;

public class Application implements GUIFactory {

    private final GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
        Button button = factory.createButton();
        button.paint();
        Checkbox checkbox = factory.createCheckbox();
        checkbox.paint();
    }

    @Override
    public Button createButton() {
        return factory.createButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return factory.createCheckbox();
    }
}

