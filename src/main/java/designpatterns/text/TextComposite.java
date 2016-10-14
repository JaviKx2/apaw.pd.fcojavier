package designpatterns.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextComposite extends Componente {
	private List<Componente> components;

	public TextComposite() {
		components = new ArrayList<>();
	}

	@Override
	public void add(Componente component) {
		if (check(component)) {
			this.components.add(component);
		}
	}

	@Override
	public void remove(Componente component) {
		this.components.remove(component);
	}

	@Override
	public String dibujar(boolean uppercase) {
		String painting = new String();
		for (Componente component : components) {
			painting += component.dibujar(uppercase);
		}
		painting += ending();
		return painting;
	}

	public abstract String ending();

	public abstract boolean check(Componente component);
}
