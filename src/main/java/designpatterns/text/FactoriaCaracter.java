package designpatterns.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private Map<Character, Caracter> characters;

	private static FactoriaCaracter factoriaCaracter;

	private FactoriaCaracter() {
		characters = new HashMap<>();
	}

	public Caracter get(char character) {
		Caracter caracter = characters.get(character);
		if (caracter == null) {
			caracter = new Caracter(character);
			characters.put(character, caracter);
			return caracter;
		} else {
			return characters.get(character);
		}
	}

	public static FactoriaCaracter getFactoria() {
		if (factoriaCaracter == null) {
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
	}
}
