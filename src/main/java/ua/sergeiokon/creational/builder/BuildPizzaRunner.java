package ua.sergeiokon.creational.builder;

public class BuildPizzaRunner {

    public static void main(String[] args) {
        Client client = new Client();
        client.setPizzaBuilder(new BarbecuePizza());

        Pizza pizza = client.buildPizza();
        System.out.println(pizza);
    }


}
