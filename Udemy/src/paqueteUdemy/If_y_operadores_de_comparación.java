package paqueteUdemy;
import java.util.Scanner;
public class If_y_operadores_de_comparaci�n{
//el funcionamiento de este programa no tiene logica solamente es para entender un poco
	public static void main(String[] args)
	{
		int edad;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Escriba su edad:");
			 edad=in.nextInt();
		}
		if (edad > 18){
			System.out.println("Eres mayor de edad ");	
		}
		//Importante recordar que el igual en java es con un doble igual
		if (edad == 18) {
			System.out.println("Acabas de cumplir 18 a�os eres mayor de edad 18");
		}
		//para negar se usa !
		if (edad != 17){
			System.out.println("Eres menor de edad ");	
		}
		else {
			System.out.println("no puedes acceder");
			
		}
	 }

}
	