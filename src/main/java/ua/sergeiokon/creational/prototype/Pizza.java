package ua.sergeiokon.creational.prototype;

public interface Pizza extends Cloneable {

    Pizza makePizza() throws CloneNotSupportedException;

}
