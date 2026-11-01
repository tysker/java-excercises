package src.lambdas;

import src.lambdas.interfaces.*;

import java.util.ArrayList;
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
//        Transformer transformer = (aList, lb) -> aList.stream().map(lb::transform).toList();
//        List<String> strings = transformer.applyAll(List.of("Steve", "Jörg"), upperLambda);
//        System.out.println(strings);

        // 5. Generic interfaces
        List<String> words = List.of("hi", "java", "is", "great", "fun", "lambda");
        List<String> longWords = filter(words, (w) -> w.length() > 2);
        List<Integer> length = map(longWords, String::length);
        System.out.println(length);

        // 6. Combinable conditions

    }

    static void printThing(Printable thing) {
        System.out.println(thing.print("!"));
    }

    static <T> List<T> filter(List<T> list, Condition<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    static <T, R> List<R> map(List<T> list, Transformer<T, R> transformer) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        return result;
    }


}
