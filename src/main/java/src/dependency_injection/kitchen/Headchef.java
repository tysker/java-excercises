package src.dependency_injection.kitchen;

public class Headchef implements IChef {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }


    @Override
    public void cook() {
        System.out.println("Cooking food");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning kitchen");
    }

    /**
     * This is a javadoc example
     * @param input the input value
     * @param number the number value
     * @return the return value
     */
    public String javadocExample(String input, int number) {
        return input + number;
    }
}
