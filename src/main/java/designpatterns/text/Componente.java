package designpatterns.text;

public abstract class Componente {
	private boolean isComposite;

	public abstract void add(Componente component);

	public abstract void remove(Componente component);

	public abstract String dibujar(boolean uppercase);

	public boolean isComposite() {
		return isComposite;
	}

}
