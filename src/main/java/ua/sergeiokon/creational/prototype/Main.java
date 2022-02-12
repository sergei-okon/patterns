package ua.sergeiokon.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePizza cheesePizza = new ConcretePizza();

        cheesePizza.setName("CARBONARA");
        cheesePizza.setCheese("Mozzarella");
        cheesePizza.setIngredients("Bacon");
        System.out.println(cheesePizza);

        ConcretePizza pizza = (ConcretePizza) cheesePizza.makePizza();
        pizza.setSous("BBQ");
        System.out.println(pizza);

    }


}
