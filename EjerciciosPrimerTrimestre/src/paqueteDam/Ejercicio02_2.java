package paqueteDam;
import java.util.*;
public class Ejercicio02_2 {

	public static void main(String[] args) {
		String texto = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba su texto:");
		texto = in.nextLine();
		StringTokenizer st= new StringTokenizer(texto);
		System.out.println(st.countTokens());
	}

	}


