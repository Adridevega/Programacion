package paqueteUdemy;
import java.util.*;

public class For {//el bucle for siver como el whole o el do while lo que se pone todas las ordener juntas

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int num;
		int i = 1;
		System.out.println("Introduzca el nuúmero del cual quieres saber la tabla de multiplicar: ");
		num= in.nextInt();
		
		for (i=1; i <=10; i++) {
			System.out.println(num +  "*" + i + "=" + num * i);
		}
	}

}
