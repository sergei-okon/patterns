package ua.sergeiokon.structural.proxy;

public class ProxyProject implements Project {

    String initialData = "/resources/InitialDataToDB.scr";
    EducationalProject educationalProject;

    public ProxyProject() {
    }

    @Override
    public void runProject() {
        if (educationalProject == null) {
            educationalProject = new EducationalProject();
        }
        educationalProject.runProject();
    }
}
