package src.annotations;

@VeryImportant
public class Cat {

    @ImportantString
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately(times = 3, value1 = "test1", value2 = "test2")
    public void meow() {
        System.out.println("Meow!");
    }

    @OnlyWeekend(day = {Weekdays.SATURDAY, Weekdays.MONDAY})
    public void eat() {
        System.out.println("Munch!");
    }
}
