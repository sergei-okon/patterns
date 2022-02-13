package ua.sergeiokon.behavioral.chain;

public class ChainRunner {

    public static void main(String[] args) {
        ChainOfResponsibility firstChain = new NegativeNumberHandler();
        ChainOfResponsibility secondChain = new PositiveNumberHandler();
        ChainOfResponsibility thirdChain = new ZeroNumberHandler();

        firstChain.nextChain(secondChain);
        secondChain.nextChain(thirdChain);

        firstChain.requestProcess(new Number(-1));
        firstChain.requestProcess(new Number(5));
        firstChain.requestProcess(new Number(0));
    }
}
