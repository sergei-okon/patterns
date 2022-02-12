package ua.sergeiokon.creational.abstractfactory;

public class ApplicationRunner {

    public static void main(String[] args) throws Exception {
        String configOs = "Windows";
        GUIFactory factory;

        if (configOs.equals("Windows")) {
            factory = new WinFactory();
        } else if (configOs.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }

        Application app = new Application(factory);

    }
}