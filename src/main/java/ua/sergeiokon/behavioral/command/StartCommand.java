package ua.sergeiokon.behavioral.command;

public class StartCommand implements Command {

    Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
