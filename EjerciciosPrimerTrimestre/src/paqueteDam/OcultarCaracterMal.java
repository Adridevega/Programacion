package paqueteDam;
import java.util.Scanner;
public class OcultarCaracterMal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase;

		System.out.println("Introduzca frase...");
		frase=in.nextLine();
		in.close();
		frase = frase.substring(0, frase.length() - 1);    
			System.out.println(frase);	
			//EXPERIMENTAL
			
		
		}
	}


