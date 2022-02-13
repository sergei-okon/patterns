package ua.sergeiokon.structural.decorator;

public class PizzaWithBacon extends PizzaDecorator {

    public PizzaWithBacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 7;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + Bacon";
    }
}
