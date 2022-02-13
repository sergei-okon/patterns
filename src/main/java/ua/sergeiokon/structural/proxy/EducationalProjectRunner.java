package ua.sergeiokon.structural.proxy;

public class EducationalProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject();

        project.runProject();
    }
}
