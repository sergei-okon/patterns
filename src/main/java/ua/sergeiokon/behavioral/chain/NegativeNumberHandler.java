package ua.sergeiokon.behavioral.chain;

public class NegativeNumberHandler implements ChainOfResponsibility {

    public ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Number number) {
        if (number.getNumber() < 0) {
            System.out.println("NegativeNumberHandler: " + number.getNumber());
        }else {
            chain.requestProcess(number);
        }
    }
}
