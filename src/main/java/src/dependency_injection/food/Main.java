package src.dependency_injection.food;

public class Main {

    public static void main(String[] args) {
        Chef pizzaChef = new Chef(new Pizza());
        Chef burgerChef = new Chef(new Burger());

        pizzaChef.prepareFood();
        burgerChef.prepareFood();
    }
}
