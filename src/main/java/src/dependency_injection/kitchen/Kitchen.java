package src.dependency_injection.kitchen;

public class Kitchen {

    private IChef chef;

    public Kitchen(IChef chef) {
        this.chef = chef;
    }

    public void cook() {
        chef.cook();
    }

    public void clean() {
        chef.clean();
    }

    public String getName() {
        return chef.getName();
    }


}
