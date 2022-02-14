package ua.sergeiokon.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(concreteColleague1);
        mediator.setColleague2(concreteColleague2);

        concreteColleague1.send("How are you?");
        concreteColleague2.send("Fine, thanks");
    }
}