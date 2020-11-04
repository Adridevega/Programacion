package paqueteUdemy;
import java.util.*;
public class While {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		int i = 1;
			System.out.println("Introduzca el nuúmero del cual quieres saber la tabla de multiplicar: ");
			num= in.nextInt();
				
		while (i <= 10) {
			System.out.println(num +  "*" + i + "=" + num * i);
			i++; //este i++ hace que se pueda crar el bucle ya que sin el, lo mas seguro es que fuera un bucle infinito donde se quedaria en el uno
			//Lo que esta expresando es que, i vale uno, y que cuando se cumpla el syso se le sume otro repieitneod el bucle hasta el 10
			
		}
		
	}

}
