package src.inheritance;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class TaskList <T extends Task> implements Iterable<T> {

    private final List<T> tasks = new ArrayList<>();
    private int size;
    private int index = 0;

    public TaskList() {
        this.size = 0;
        this.index = 0;
    }

    public void add(T task) {
        tasks.add(task);
        size++;
    }

    public void remove(T task) {
        tasks.remove(task);
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new TaskListIterator();
    }

    private class TaskListIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return tasks.get(index++);
        }
    }
}
