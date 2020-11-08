package paqueteDam;
import java.util.*;
public class Ejercicio02_1 
{

	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Introduzca el primer número");
		int num1 =	in.nextInt();
		int num2 = in.nextInt();
		int a = Math.max(num1, num2);
		int b= Math.min(num1, num2);
		int res;
		do {
			res = b;
			b=a%b;
		}while(b!=0);
		System.out.println("El M.C.D entre "+num1+" y "+num2+" es: " + res);
		}
	}
		



