package paqueteUdemy;
import java.util.*;
public class Calculos {

	public static void main(String[] args) {
		int num1, num2, res;
		Scanner in = new Scanner(System.in);
		System.out.println("Intrdozca los valos de la operaci�n");
			System.out.println("Primer valor: ");
			num1 = in.nextInt();
			//System.out.println("Segundo valor: ");
			//num2 = in.nextInt();
			//res= num1 + num2;
			//res= num1 * num2;
			//res= num1 / num2;
			//res= num1 % num2;
				//esta ultima operaci�n dara el resto de la division como resultado
			num1= num1 +1;
				//al a�adir un +1 o num1 ++; lo que haria seria sumar
				//igual que si poner -1 o num1--
				//y tambien se aplica para las multiplicaciones
		//System.out.println("El resultado de la operaci�n " + num1 +  " y "  + num2 + " es " + res);
			System.out.println("el resultado es " + num1);
	}

}
