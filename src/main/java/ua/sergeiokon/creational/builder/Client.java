package ua.sergeiokon.creational.builder;

public class Client {

    PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    Pizza buildPizza() {
        pizzaBuilder.createPizza();
        pizzaBuilder.buildName();
        pizzaBuilder.buildIngredients();
        pizzaBuilder.buildSous();

        Pizza pizza = pizzaBuilder.getPizza();
        return pizza;
    }
}
