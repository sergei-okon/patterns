package ua.sergeiokon.behavioral.memento;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void load(Memento memento) {
        state = memento.getState();
    }
}
