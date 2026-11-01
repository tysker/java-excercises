package src.lambdas;

import src.lambdas.interfaces.*;

import java.util.List;

import static src.lambdas.interfaces.Condition.filter;
import static src.lambdas.interfaces.Printable.printThing;
import static src.lambdas.interfaces.Transformer.map;


public class Main {

    public static void main(String[] args) {

        Printable lambdaPrintable = (s) -> "meow" + s;
        printThing(lambdaPrintable);

        // Validator
        Validator username = Validator
                .notEmpty()
                .and(Validator.maxLength(12))
                .and(s -> !s.contains(" "));
        System.out.println(username.validate("bob"));        // true
        System.out.println(username.validate("bob smith"));  // false

        // 1. Greeter
        Greeter greetsHello = (name) -> System.out.println("Hello " + name + "!");
        Greeter greetUpperCase = (name) -> System.out.println(name.toUpperCase() + "!!!");
        greetsHello.greet("Steve");
        greetUpperCase.greet("Jörg");

        // 2. Calculator
        MathOperation add = Integer::sum;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a / b;
        };

        int part = MathOperation.calculate(10, 5, divide);

        int product = MathOperation.calculate(20, 20, multiply);
        int difference = MathOperation.calculate(50, 10, subtract);
        int result = MathOperation.calculate(product, difference, add);
        System.out.println(result);
        System.out.println(part);


        // 3. String transformer
        StringTransformer upperLambda = String::toUpperCase;
        StringTransformer reverseLambda = s -> new StringBuilder(s).reverse().toString();
        System.out.println(upperLambda.transform("Hallo"));
        System.out.println(reverseLambda.transform("Steve"));

        // 4. Apply to a list
        List<String> words01 = List.of("hi", "java", "is", "great", "fun", "lambda");
        StringTransformer upperCase = String::toUpperCase;
        List<String> listOfUpperCaseWords = StringTransformer.applyAll(words01, upperCase);
        System.out.println(listOfUpperCaseWords);

        // 5. Generic interfaces
        List<String> words02 = List.of("hi", "java", "is", "great", "fun", "lambda");
        List<String> longWords = filter(words02, (w) -> w.length() > 3);
        List<Integer> length = map(longWords, String::length);
        System.out.println(length);

        // 6. Combinable conditions
        List<Integer> numbers = List.of(1, 2, 3, 4, 10, 11, 12, 15, 20, 21, 30);
        Condition<Integer> isEven = n -> n % 2 == 0;
        Condition<Integer> greaterThan10 = n -> n > 10;

        Condition<Integer> rule = isEven.and(greaterThan10).or(Condition.isEqual(3));
        System.out.println(filter(numbers, rule));
        System.out.println(filter(numbers, isEven.negate()));

    }
}
