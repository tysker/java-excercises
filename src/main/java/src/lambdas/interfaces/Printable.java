package src.lambdas.interfaces;

@FunctionalInterface
public interface Printable {
    String print(String suffix);

    static void printThing(Printable thing) {
        System.out.println(thing.print("!"));
    }

}
