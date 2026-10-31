package src.dependency_injection.controller;

import java.util.List;

public class TestController2<T,D> implements Controller<T, D> {

    @Override
    public T read(D d) {
        return null;
    }

    @Override
    public List<T> readAll() {
        return null;
    }

    @Override
    public void create(T t) {
    }

    @Override
    public void update(D d, T t) {
    }

    @Override
    public void delete(D d) {

    }
}
