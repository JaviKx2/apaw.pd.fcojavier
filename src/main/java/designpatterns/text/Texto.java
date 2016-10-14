package designpatterns.text;

public class Texto extends TextComposite {
	@Override
	public boolean check(Componente component) {
		if (component instanceof Caracter) {
			throw new UnsupportedOperationException();
		}
		return true;
	}

	@Override
	public String ending() {
		return "---o---\n";
	}

}
