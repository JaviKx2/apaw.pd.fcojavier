package designpatterns.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private Map<Character, Caracter> characters;
	private static FactoriaCaracter factoriaCaracter;
	
	private FactoriaCaracter(){
		characters = new HashMap<>();
	}
	
	public Caracter get(char character){
		return characters.get(character);
	}
	
	public static FactoriaCaracter getFactoria(){
		if(factoriaCaracter == null)
			return new FactoriaCaracter();
		return factoriaCaracter;
	}
}
