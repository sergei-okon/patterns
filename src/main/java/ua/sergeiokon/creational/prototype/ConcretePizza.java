package ua.sergeiokon.creational.prototype;

public class ConcretePizza implements Pizza {

    private String name;
    private String ingredients;
    private String cheese;
    private String sous;

    @Override
    public Pizza makePizza() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "ConcretePizza{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sous='" + sous + '\'' +
                '}';
    }
}
