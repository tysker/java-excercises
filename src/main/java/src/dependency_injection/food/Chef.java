package src.dependency_injection.food;

public class    Chef {

    private Food food;

    public Chef(Food food) {
        this.food = food;
    }

    public void prepareFood() {
        food.prepareFood();
    }
}
