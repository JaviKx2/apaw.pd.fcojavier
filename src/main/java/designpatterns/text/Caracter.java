package designpatterns.text;

public class Caracter extends Componente {
	char character;

	public Caracter(char character) {
		this.character = character;
	}

	@Override
	public void add(Componente component) {

	}

	@Override
	public void remove(Componente component) {
		// TODO Auto-generated method stub

	}

	@Override
	public String dibujar(boolean uppercase) {
		String charString = String.valueOf(character);
		if (uppercase) {
			return charString.toUpperCase();
		}
		return charString;
	}

}
