package ua.sergeiokon.behavioral.interpreter;

public class Interpreter {

    Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public String interpret(String text) {
        Expression expression;

        int number = Integer.parseInt(text.substring(0, text.indexOf(" ")));

        if (text.contains("Binary")) {
            expression = new BinaryExpression(number);

        } else if (text.contains("Octal")) {
            expression = new OctalExpression(number);

        } else if (text.contains("Hexadecimal")) {
            expression = new HexadecimalExpression(number);

        } else return text;
        return expression.interpreter(context);
    }
}
