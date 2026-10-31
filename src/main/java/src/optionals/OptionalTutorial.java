package src.optionals;

import java.util.Optional;

public class OptionalTutorial {

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Sissi");

//        Cat myCatOrElse = optionalCat.orElse(new Cat("UNKNOWN",0));
//        Cat myCatOrElseGet = optionalCat.orElseGet( () -> new Cat("orElseGet",3));
//         optionalCat.orElseThrow();
        Long catAge = (Long.valueOf(optionalCat.map(Cat::getAge).orElse(0)));
        System.out.println(catAge);


//        if (optionalCat.isPresent()) {
//            System.out.println(optionalCat.get().getAge());
//        } else {
//            System.out.println(0);
//        }

    }

    // without optionals
//    private static Cat findCatByName(String name){
//       Cat cat = new Cat(name, 3);
//       return cat;
//    }

    // with optionals
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}
