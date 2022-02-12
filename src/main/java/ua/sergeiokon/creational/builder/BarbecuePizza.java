package ua.sergeiokon.creational.builder;

public class BarbecuePizza extends PizzaBuilder {

    @Override
    void buildName() {
        pizza.setName("barbecue");
    }

    @Override
    void buildIngredients() {
        pizza.setIngredients("bacon, cheese");
    }

    @Override
    void buildSous() {
        pizza.setSous(Sous.BARBECUE);
    }
}
