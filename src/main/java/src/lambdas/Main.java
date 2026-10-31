package src.lambdas;

import src.lambdas.interfaces.*;

import java.util.List;


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
        MathOperation add = Integer::sum;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation divide = (a, b) -> a / b;
        MathOperation multiply = (a, b) -> a * b;

        int result = MathOperation.calculate(MathOperation.calculate(20,20, multiply),MathOperation.calculate(50,10,subtract), add );
        System.out.println(result);

        // StringTransformer
        StringTransformer upperLambda = String::toUpperCase;
        StringTransformer reverseLambda = s -> new StringBuilder(s).reverse().toString();
        System.out.println(upperLambda.transform("Hallo"));
        System.out.println(reverseLambda.transform("Steve"));

        // List Transformer
        Transformer transformer = (aList, lb) -> aList.stream().map(lb::transform).toList();
        List<String> strings = transformer.applyAll(List.of("Steve", "Jörg"), upperLambda);
        System.out.println(strings);


    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
