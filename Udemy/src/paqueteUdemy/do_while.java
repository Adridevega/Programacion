package paqueteUdemy;
import java.util.Scanner;
public class do_while {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		int i = 1;
			System.out.println("Introduzca el nuúmero del cual quieres saber la tabla de multiplicar: ");
			num= in.nextInt();
				//A diferencia del while, en este caso el programa primero realiza la accion y luego comrpueba
			do {
				System.out.println(num +  "*" + i + "=" + num * i);
				i++; //este i++ hace que se pueda crar el bucle ya que sin el, lo mas seguro es que fuera un bucle infinito donde se quedaria en el uno
				//Lo que esta expresando es que, i vale uno, y que cuando se cumpla el syso se le sume otro repieitneod el bucle hasta el 10
				
			}while (i <= 10);
				
	}

}
