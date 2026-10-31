package src.dependency_injection.kitchen;

public class App {

    public static void main(String[] args) {
        IChef chef = new Headchef();
        IChef chef2 = new CommisDeCuisine();
        Kitchen kitchen = new Kitchen(chef);
        Kitchen kitchen2 = new Kitchen(chef2);

        kitchen.cook();
        kitchen.clean();
        System.out.println(kitchen.getName());
        System.out.println(kitchen2.getName());
    }
}
