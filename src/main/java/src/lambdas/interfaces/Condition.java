package src.lambdas.interfaces;

@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);      // takes a T, answers yes/no
}
