package ua.sergeiokon.creational.builder;

public class ChilePizza extends PizzaBuilder {

    @Override
    void buildName( ) {
        pizza.setName("CHILE");
    }

    @Override
    void buildIngredients( ) {
        pizza.setIngredients("sausage, cheese");
    }

    @Override
    void buildSous( ) {
        pizza.setSous(Sous.CHILE);
    }
}
