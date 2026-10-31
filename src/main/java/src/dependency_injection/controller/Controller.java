package src.dependency_injection.controller;

import java.util.List;

public interface Controller<T,D> {
    T read(D d);
    List<T> readAll();
    void create(T t);
    void update(D d, T t);
    void delete(D d);
}
