package src.dependency_injection.food;

public class Pizza implements Food{
    @Override
    public void prepareFood() {
        System.out.println("Pizza is prepared");
    }
}
