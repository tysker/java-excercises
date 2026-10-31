package src.lambdas.interfaces;

import java.util.List;

@FunctionalInterface
public interface Transformer {

    List<String> applyAll(List<String> list, StringTransformer t);
}
