package src.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Fred");

        // System.out.println(optionalCat.get().getAge()); // Bad
        // if(optionalCat.isPresent()) System.out.println(optionalCat.get().getAge()); // Bad

        // 1
        Cat myCat1 = optionalCat.orElse(new Cat("unknown", 0));

        // 2
        Cat myCat2 = optionalCat.orElseGet( () -> new Cat("unknown",0));

        // 3
        // Cat myCat3 = optionalCat.orElseThrow(() -> new RuntimeException("No cat found")); // ????

        // 4
        Integer age = optionalCat.map(cat -> cat.getAge()).orElse(0);

        System.out.println(myCat1.getAge());
        System.out.println(myCat2.getAge());
        //System.out.println(myCat3.getAge());
        System.out.println(age);

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}
