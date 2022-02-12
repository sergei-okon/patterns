package ua.sergeiokon.creational.builder;

public class Pizza {

    private String name;
    private String ingredients;
    private Sous sous;

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setSous(Sous sous) {
        this.sous = sous;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", sous='" + sous + '\'' +
                '}';
    }
}

