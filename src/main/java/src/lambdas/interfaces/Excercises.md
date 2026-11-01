## Your question: what are the "extra" methods for?

You've got the rule right. A functional interface has exactly one abstract method, and that method is what the lambda
implements. The other kinds of methods give the interface extra behavior around that one method.

**Default methods** are instance methods that already have a body. Every lambda of that type gets them automatically.
They are usually used to *combine or modify* functions, and they return a new lambda built from `this`.

**Static methods** belong to the interface itself, not to any lambda. They are usually *factories* that hand you
ready-made lambdas, or helpers.

**Private methods** (Java 9+) are helpers shared by the default and static methods. Users of the interface can't see
them.

Here is a small example that has all of them:

```java

@FunctionalInterface
interface Validator {
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

// Usage
Validator username = Validator.notEmpty()
        .and(Validator.maxLength(12))
        .and(s -> !s.contains(" "));

System.out.

println(username.validate("bob"));        // true
        System.out.

println(username.validate("bob smith"));  // false
```

The JDK uses this pattern all the time:

- `Predicate`: `and()`, `or()`, `negate()` (default), `Predicate.not()` and `Predicate.isEqual()` (static)
- `Function`: `andThen()`, `compose()` (default), `Function.identity()` (static)
- `Comparator`: `reversed()`, `thenComparing()` (default), `Comparator.comparing()` (static)

So `people.sort(Comparator.comparing(Person::getAge).reversed())` uses a static factory first and then a default method
on what it returns.

A small detail: abstract methods that override `Object` methods, such as `equals` or `toString`, don't count toward
the "one abstract method" rule. That's why `Comparator` can declare `equals` and still be functional.

---

## Exercises

Write your own interfaces for these. Don't use `java.util.function` until the bonus. Add `@FunctionalInterface` to each
one so the compiler checks the rule for you.

### Level 1: Basics

**1. Greeter**
Create `Greeter` with `void greet(String name)`. Write two lambdas: one prints `"Hello, <name>!"` and one prints the
name in uppercase with `"!!!"` after it.

**2. Calculator**
Create `MathOperation` with `int operate(int a, int b)`. Make lambdas for add, subtract, multiply and divide. Write
`static int calculate(int a, int b, MathOperation op)` and call it with each lambda.

**3. String transformer**
Create `StringTransformer` with `String transform(String s)`. Write lambdas for uppercase, reverse (
`new StringBuilder(s).reverse().toString()`) and "trim plus lowercase". Write at least one of them as a **method
reference**, such as `String::toUpperCase`.

### Level 2: Using lambdas as parameters

**4. Apply to a list**
Write `List<String> applyAll(List<String> list, StringTransformer t)`. It should return a new list with the transformer
applied to each element.

**5. Generic interfaces**
Make `Transformer<T, R>` with `R apply(T t)` and `Condition<T>` with `boolean test(T t)`. Then write:

- `<T> List<T> filter(List<T> list, Condition<T> c)`
- `<T, R> List<R> map(List<T> list, Transformer<T, R> t)`

Use them to get the lengths of all words longer than 3 characters.

### Level 3: Default and static methods

**6. Combinable conditions**
Add `and`, `or` and `negate` as default methods to `Condition<T>`. Add the static factory
`static <T> Condition<T> isEqual(T value)`. Then filter a list of numbers for values that are "even AND greater than 10,
OR equal to 3".

**7. Chaining transformers**
Add `default <V> Transformer<T, V> andThen(Transformer<R, V> next)` and `static <T> Transformer<T, T> identity()` to
`Transformer`. Chain three transformers: trim, then uppercase, then get the length.

### Level 4: Lambdas that create lambdas

**8. Function factories and capture**
Write `static MathOperation multiplierPlus(int factor)`. It should return a lambda that computes `a * factor + b`. Then
try to change a local variable inside a lambda, like `count++`, and read the compiler error. Explain to yourself what "
effectively final" means and why the rule exists.

**9. Your own Comparator**
Create `MyComparator<T>` with `int compare(T a, T b)`. Add:

- `static <T> MyComparator<T> comparing(Transformer<T, Integer> keyExtractor)`
- `default MyComparator<T> reversed()`
- `default MyComparator<T> thenComparing(MyComparator<T> other)`

Make a `Person` record with name and age. Sort a list by age descending, then by name length. You can adapt your
comparator into `list.sort(...)` with `myComp::compare`.

### Level 5: Challenge

**10. Memoization**
Write `static <T, R> Transformer<T, R> memoize(Transformer<T, R> f)`. It should return a transformer that caches results
in a `HashMap`. Test it with a slow function, such as one that calls `Thread.sleep(1000)` before returning, and time the
first and second calls.

**11. Checked exceptions**
Lambdas in `Function` can't throw checked exceptions. Create `ThrowingFunction<T, R>` with
`R apply(T t) throws Exception`. Then add `static <T, R> Function<T, R> unchecked(ThrowingFunction<T, R> f)`, which
wraps the call and rethrows any checked exception as a `RuntimeException`. Use it with `Files::readString` inside a
stream over a list of `Path`s.

**Bonus:** Redo exercises 5–7 using `java.util.function` (`Predicate`, `Function`, `BiFunction`, `UnaryOperator`).
Notice how close your versions are to the real ones.

