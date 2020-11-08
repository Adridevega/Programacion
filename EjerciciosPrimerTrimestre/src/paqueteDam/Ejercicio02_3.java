package paqueteDam;
import java.util.*;
public class Ejercicio02_3 {

	public static void main(String[] args) {
		{ 
			Scanner in= new Scanner(System.in);
	        int n =0;
	        System.out.println("¿De que número desea tener los divisores? ");
	        n=in.nextInt();
			for (int i=1;i<=n;i++) 
	            if (n%i==0) 
	                System.out.print(i+" "); 
	    } 
	}

}
