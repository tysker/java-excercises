package src.dependency_injection.food;

public class Burger implements Food{
    @Override
    public void prepareFood() {
        System.out.println("Burger is prepared");
    }
}
