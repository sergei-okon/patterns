package ua.sergeiokon.creational.factory;

public class IdFactoryRunner {
    public static void main(String[] args) {
        IdFactory idFactory = createIdBySpecialty("post");

        Id id = idFactory.createId();
        id.getLastId();
    }

    static IdFactory createIdBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("writer")) {
            return new WriterIdFactory();
        } else if (specialty.equalsIgnoreCase("post")) {
            return new PostIdFactory();
        } else if (specialty.equalsIgnoreCase("label")) {
            return new LabelIdFactory();
        } else throw new RuntimeException("Invalid specialty");
    }
}
