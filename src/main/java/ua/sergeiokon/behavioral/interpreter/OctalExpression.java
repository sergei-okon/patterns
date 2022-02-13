package ua.sergeiokon.behavioral.interpreter;

public class OctalExpression implements Expression {

    private int number;

    public OctalExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpreter(Context context) {
        return context.getOctalExpression(number);
    }
}
