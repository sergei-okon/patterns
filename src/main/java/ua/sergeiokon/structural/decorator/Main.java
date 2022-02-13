package ua.sergeiokon.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza simplePizza = new SimplePizza();
        System.out.println(simplePizza.getCost() + " " + simplePizza.getIngredients());

        Pizza baconPizza = new PizzaWithBacon(new SimplePizza());
        System.out.println(baconPizza.getCost() + " " + baconPizza.getIngredients());

        Pizza mushroomBaconPizza = new PizzaWithMushrooms(new PizzaWithBacon(new SimplePizza()));
        System.out.println(mushroomBaconPizza.getCost() + " " + mushroomBaconPizza.getIngredients());

    }


}
