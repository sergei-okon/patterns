package ua.sergeiokon.creational.builder;

public abstract class PizzaBuilder {
    Pizza pizza;

    void createPizza() {
        pizza = new Pizza();
    }

    abstract void buildName();

    abstract void buildIngredients();

    abstract void buildSous();

    Pizza getPizza() {
        return pizza;
    }
}
