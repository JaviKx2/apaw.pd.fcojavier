package designpatterns.memento.calculator;

public interface Mementable<T> {
    public T createMemento();
    public void restoreMemento(T memento);
}
