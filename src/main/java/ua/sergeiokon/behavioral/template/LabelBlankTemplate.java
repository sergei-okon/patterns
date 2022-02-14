package ua.sergeiokon.behavioral.template;

public abstract class LabelBlankTemplate {

    public void showPage() {
        System.out.println("MICROSOFT CORP");
        System.out.println("_________________");
        System.out.println();

        showLatterContent();

        System.out.println();
        System.out.println("Sincerely, ");
        System.out.println("          CEO Bill Gates  ________ ");
    }

    public abstract void showLatterContent();
}
