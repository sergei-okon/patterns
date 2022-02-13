package ua.sergeiokon.structural.decorator;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }
}
