package ua.sergeiokon.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Version 1");
        originator.setState("Version 2");
        careTaker.add(originator.save());

        originator.setState("Version 3");
        careTaker.add(originator.save());

        originator.setState("Version 4");
        System.out.println("Current state " + originator.getState());

        originator.load(careTaker.get(0));
        System.out.println("First saving state " + originator.getState());

        originator.load(careTaker.get(1));
        System.out.println("Second saving state " + originator.getState());

    }
}
