package src.lambdas.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@FunctionalInterface
public interface Condition<T> {
    boolean test(T t); // takes a T, answers yes/no

    default Condition<T> and(Condition<T> other) {
        return t -> this.test(t) && other.test(t);
    }

    default Condition<T> or(Condition<T> other) {
        return t -> this.test(t) || other.test(t);
    }

    default Condition<T> negate() {
        return t -> !this.test(t);
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

    static <T> Condition<T> isEqual(T value) {
        return t -> Objects.equals(t, value);
    }

}
