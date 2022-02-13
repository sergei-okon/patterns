package ua.sergeiokon.behavioral.interpreter;

public class HexadecimalExpression implements Expression {

    private int number;

    public HexadecimalExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpreter(Context context) {
        return context.getHexadecimalExpression(number);
    }
}
