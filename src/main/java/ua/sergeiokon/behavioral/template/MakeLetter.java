package ua.sergeiokon.behavioral.template;

public class MakeLetter {

    public static void main(String[] args) {
        LabelBlankTemplate nw = new BlankNewYearGreetings();
        LabelBlankTemplate fired = new FormOfDismissal();

        nw.showPage();

        System.out.println("==============================================================================\n");

        fired.showPage();
    }
}
