package paqueteUdemy;
import java.util.*;
public class Operadores_Logicos {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		//los numeros premiados son 4,5 y 20 aparte de ser mayor de edad
		int numero;
		int edad;
		System.out.println("Introduzca su n�mero para ver si ha sido premiado");
		numero = in.nextInt();
		System.out.println("Introduzca su edad");
		edad = in.nextInt();
		// la doble barra es como decir O UNA COSA O LA OTRA y la doble & seria que se tienen que cumplir ambas acciones
		if (numero == 4 && edad >= 18|| numero == 5 && edad >= 18 || numero == 20 && edad >= 18) {
			System.out.println("El numero es el premiado");
		}
		else {
			System.out.println("No es ninguno de los numero premiados");
		}
	}

}
