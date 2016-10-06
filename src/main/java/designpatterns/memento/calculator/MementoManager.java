package designpatterns.memento.calculator;

import java.util.Map;

public class MementoManager<T> {
    Map<String, T> mementos;

    public void addMemento(String key, T memento) {
        mementos.put(key, memento);
    }

    public T getMemento(String key) {
        return mementos.get(key);
    }

    public String[] keys() {
        return mementos.keySet().toArray(new String[0]);
    }
}
