package designpatterns.text;

public abstract class Componente {
	public abstract void add(Componente component);

	public abstract void remove(Componente component);

	public abstract String dibujar(boolean uppercase);
}
