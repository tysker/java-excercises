package src.lambdas.interfaces;

//@FunctionalInterface
//public interface Transformer {
//
//    List<String> applyAll(List<String> list, StringTransformer t);
//}
@FunctionalInterface
public interface Transformer<T, R> {
    R apply(T t);           // takes a T, gives back an R
}

