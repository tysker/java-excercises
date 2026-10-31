package src.dependency_injection.controller;

public class ControllerAgent<T,D> {

    private final Controller<T,D> controller;

    public ControllerAgent(Controller<T, D> controller) {
        this.controller = controller;
    }

    public T read(D id) {
        return controller.read(id);
    }

    public void create(T t) {
        controller.create(t);
    }

    public void update(T t, D d) {
        controller.update(d, t);
    }

    public void delete(D id) {
        controller.delete(id);
    }
}
