package src.lambdas.interfaces;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface StringTransformer {
    String transform(String s);

    static List<String> applyAll(List<String> list, StringTransformer t) {
        List<String> results = new ArrayList<>();

        for (String word : list) {
            results.add(t.transform(word));
        }
        return results;
    }

}
