package src.lambdas.interfaces;

@FunctionalInterface
public interface Validator {
    boolean validate(String s);              // the ONE abstract method

    // default: combine this validator with another
    default Validator and(Validator other) {
        return s -> this.validate(s) && other.validate(s);
    }

    default Validator negate() {
        return s -> !this.validate(s);
    }

    // static: factories that produce common validators
    static Validator notEmpty() {
        return s -> !s.isEmpty();
    }

    static Validator maxLength(int n) {
        return s -> s.length() <= n;
    }
}
