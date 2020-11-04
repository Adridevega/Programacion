package paqueteUdemy;
import java.util.Scanner;
//este programa es inutil solo sirve para explicar un bucle anidados que es algo importante
public class Bucles_anidados {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int num;
		int i = 1;
		System.out.println("Introduzca el nuúmero del cual quieres saber la tabla de multiplicar: ");
		num= in.nextInt();
		
		for (num =1; num <= 5; num++) {
			for (i=1; i <=10; i++) {
				System.out.println(num +  "*" + i + "=" + num * i);
			}
		}
	}

}
