package ua.sergeiokon.structural.decorator;

public class PizzaWithMushrooms extends PizzaDecorator {

    public PizzaWithMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + Mushrooms";
    }
}
