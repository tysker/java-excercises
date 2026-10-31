package src.lambdas;

import lombok.Setter;
import src.lambdas.interfaces.Printable;

public class Cat implements Printable {

    @Setter
    public String name;
    public int age;

    public Cat(){};

    @Override
    public String print(String suffix) {
        return name + " " + suffix;
    }
}
