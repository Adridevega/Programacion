package paqueteDam;

import java.util.Scanner;
public class SegundoGrado {
	public static void main(String[] args) {
//corregir y ponerlo correcto poner scanner
		//el camino de que si es "A" y "B" es igual a 0
	    int a;
	    int b;
	    int c;
	    Scanner in = new Scanner(System.in);
	    System.out.print("A: ");		
	    a=in.nextInt();
	    System.out.print("B: ");		
	    b=in.nextInt();
	    System.out.print("C: ");		
	    c=in.nextInt();

	    double raiz= b*b - (4*a*c);
	    if (raiz>0){
	        double x1=(b + Math.sqrt(raiz)) / (2*a);
	        double x2=(b - Math.sqrt(raiz)) / (2*a);
	        System.out.println("El valor de x1="+x1+"y el valor de x2="+x2);
	        }
	    else
	        System.out.println("El determinante es negativo, por lo que no se puede completar la operación");
	    }

}
