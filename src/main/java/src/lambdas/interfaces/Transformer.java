package src.lambdas.interfaces;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Transformer<T, R> {
    R apply(T t);           // takes a T, gives back an R


    static <T, R> List<R> map(List<T> list, Transformer<T, R> transformer) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        return result;
    }


}

