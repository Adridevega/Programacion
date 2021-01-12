package pildoras_informaticas;

public class Manipulacion_cadenas_dos {

	public static void main(String[] args) {
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		//sacaremos en consola la parte de aprender a programar en java
		String frase_resumen=frase.substring(0, 29) + " irnos a la platya y olvidarnos de todo " + "y " + frase.substring(29, 57);
		System.out.println(frase_resumen);
	}

}
