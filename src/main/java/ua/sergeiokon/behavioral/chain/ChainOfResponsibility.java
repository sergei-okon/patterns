package ua.sergeiokon.behavioral.chain;

public interface ChainOfResponsibility {

    void nextChain(ChainOfResponsibility nextChain);

    void requestProcess(Number number);
}
