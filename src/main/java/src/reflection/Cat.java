package src.reflection;

import lombok.Getter;

@Getter
public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
