package src.lambdas.interfaces;

@FunctionalInterface
public interface Condition<T> {
    boolean test(T t); // takes a T, answers yes/no

    default Condition<T> and(Condition<T> other) {
        return s -> this.test(s) && other.test(s);
    }

    default Condition<T> or(Condition<T> other) {
        return s -> this.test(s) || other.test(s);
    }

    default Condition<T> negate(Condition<T> other) {
        return s -> !this.test(s);
    }
}
