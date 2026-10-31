package src.lambdas.interfaces;

@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);

    static int calculate(int a, int b,  MathOperation op) {
        return op.operate(a, b);
    }
}
