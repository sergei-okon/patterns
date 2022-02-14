package ua.sergeiokon.behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        for (Iterator iterator = database.getIterator(); iterator.hasNext(); ) {

            String name = String.valueOf(iterator.next());
            System.out.println("Database name : " + name);
        }
    }
}

