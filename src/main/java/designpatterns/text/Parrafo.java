package designpatterns.text;

public class Parrafo extends TextComposite {
	@Override
	public boolean check(Componente component) {
		if (component instanceof Parrafo) {
			throw new UnsupportedOperationException();
		}
		return true;
	}

	@Override
	public String ending() {
		return "\n";
	}
}
