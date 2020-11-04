package paqueteDam;
import java.util.*;
public class Ejercicios01_1 {

	public static void main(String[] args) {
		double price;
		Scanner precio = new Scanner (System.in);
		System.out.println("Introduzca el precio");
		price = precio.nextDouble();
		double procentaje = 0.11 * price;
		double final_price= price + procentaje;
			if(final_price < 1000) {
				System.out.println(final_price);
			}
			else {
				System.out.println("\"Cariiiisimo\"");
			}
	}

}
