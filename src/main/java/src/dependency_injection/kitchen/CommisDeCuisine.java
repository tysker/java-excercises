
package src.dependency_injection.kitchen;

public class CommisDeCuisine implements IChef{

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void cook() {

    }

    @Override
    public void clean() {

    }
}
