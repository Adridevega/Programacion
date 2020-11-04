package paqueteDam;
import java.util.Scanner;
public class Contador {

	public static void main(String[] args) {
		System.out.println("Introduzca 10 números enteros ");
		int a,b,c,d,e,f,g,h,i,j;
		int sumatorio=0;	
		 Scanner in = new Scanner(System.in);
		 	System.out.print("A: ");	
		    a=in.nextInt();
		    sumatorio += a;
		    System.out.print("B: ");		
		    b=in.nextInt();
		    sumatorio += b;
		    System.out.print("C: ");		
		    c=in.nextInt();
		    sumatorio += c;
		    System.out.print("A: ");		
		    d=in.nextInt();
		    sumatorio += d;
		    System.out.print("B: ");		
		    e=in.nextInt();
		    sumatorio += e;
		    System.out.print("C: ");		
		    f=in.nextInt();
		    sumatorio += f;
		    System.out.print("A: ");		
		    g=in.nextInt();
		    sumatorio += g;
		    System.out.print("B: ");		
		    h=in.nextInt();
		    sumatorio += h;
		    System.out.print("C: ");		
		    i=in.nextInt();
		    sumatorio += i;
		    System.out.print("J: ");
		    j=in.nextInt();
		    sumatorio += j;
		   int tope;
		   	System.out.println("Escriba valor tope: ");
		   	tope=in.nextInt();
		   	System.out.println("Su valor total es "+ sumatorio);
		  if(tope > sumatorio){
			  System.out.println("El valor de la sumatoria es menor que el valor tope");
		  }
		  else
			  System.out.println("El valor tope introducido es menor que el valor de la sumatoria");
	}

}
