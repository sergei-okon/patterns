package ua.sergeiokon.behavioral.interpreter;

public class InterpreterRunner {

    public static void main(String[] args) {
        String binary = "256 in Binary ";
        String octal = "256 in Octal ";
        String hexadecimal = "256 in Hexadecimal ";

        Interpreter expression = new Interpreter(new Context());

        System.out.println(binary + expression.interpret(binary));
        System.out.println(octal + expression.interpret(octal));
        System.out.println(hexadecimal + expression.interpret(hexadecimal));
    }
}
