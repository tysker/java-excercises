package src.lambdas;

import src.lambdas.interfaces.Greeter;
import src.lambdas.interfaces.MathOperation;
import src.lambdas.interfaces.Printable;
import src.lambdas.interfaces.Validator;


public class Main {

    public static void main(String[] args) {

        Printable lambdaPrintable = (s) -> "meow" + s;
        printThing(lambdaPrintable);

        // Validator
        Validator username = Validator
                .notEmpty()
                .and(Validator.maxLength(12))
                .and(s -> !s.contains(" "));
        System.out.println(username.validate(""));        // true
        System.out.println(username.validate("bob smith"));  // false

        // Greeter
        Greeter greetsHello = (name) -> System.out.println("Hello " + name + "!");
        Greeter greetUpperCase = (name) -> System.out.println(name.toUpperCase() + "!!!");
        greetsHello.greeter("Steve");
        greetUpperCase.greeter("Jörg");

        // MathOperation
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation divide = (a, b) -> a / b;
        MathOperation multiply = (a, b) -> a * b;

        int result = MathOperation.calculate(MathOperation.calculate(20,20, multiply),MathOperation.calculate(50,10,subtract), add );
        System.out.println(result);

        // StringTransformer


    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
