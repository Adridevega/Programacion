package paqueteDam;
import java.util.Scanner;

public class OcultaUltimaLetra {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String frase, frResult;
		char[] fraseTabla;
		int pos,contador = 0;
		char ch;
		char ult;

		System.out.println("Introduce una frase");
		frase = in.nextLine();
		fraseTabla = frase.toCharArray();
		ult = fraseTabla[fraseTabla.length-1];
		
		
		for (pos = 0; pos < fraseTabla.length; pos++) {
			ch = Character.toLowerCase(fraseTabla[pos]);
			ch =fraseTabla[pos];
			if (fraseTabla[pos] == fraseTabla[fraseTabla.length-1]) {
				contador++;
				fraseTabla[pos] = '*';
			}

		}
		frResult = new String(fraseTabla);
		System.out.println("La '" + ult + "' sale " + contador + " vez/veces");
		System.out.println(frResult);
	}                 

}