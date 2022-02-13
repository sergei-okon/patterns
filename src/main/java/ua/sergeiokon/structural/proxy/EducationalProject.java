package ua.sergeiokon.structural.proxy;

public class EducationalProject implements Project {

    String initialData = "/resources/InitialDataToDB.scr";

    public EducationalProject() {
        initialDataToDB(initialData);
    }

    public void initialDataToDB(String initialData) {
        System.out.println("Added initial data to Educational DB ..." + "from" + initialData);
    }

    @Override
    public void runProject() {
        System.out.println("Run Educational Project ..." + "with data from script " + initialData);
    }
}
