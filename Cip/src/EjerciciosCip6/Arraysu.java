package EjerciciosCip6;
import java.util.*;

import javax.swing.JOptionPane;
public class Arraysu
{

	public static void main(String[] args)
	{
		int contador = 0 ;
		double media = 0;
		int res = 0;
		int[] x = new int[20];
		boolean controlBucle;
		int sum = 0;
	
		Random in = new Random();
		for (int i = 0; i < x.length; i++) 
		{
			x[i] = in.nextInt(11);
		}
		int mayor, menor;
		mayor = menor = x[0];
		for (int o = 0; o < x.length; o++) {
			if(x[o] > mayor) {
				mayor = x[o];
			}
			else if (x[o]< menor) {
				menor = x[o];
			}
		}
		for (int e = 0; e < x.length; e++) {
			res+= x[e];
			media = res / 20;	
		}
			do {
				controlBucle=true;
			
			int op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué dato desea saber?\n Pulse 1 si desea saber que número es mayor \n Pulse 2 para saber el número menor \n Pulse 3 para saber la media de todos los números de su array \n Pulse 4 para saber todos los resultados de la array \n Pulse 5 para saber cuantas veces se repite un número \n Pulse 0 para mostrar de nuevo las opciones"));
			if (op==1) {
				System.out.println( "El mayor número es " + mayor);
			}
			else if (op==2) {
				System.out.println( "El menor número es " + menor);
			}
			else if (op==3) {
				System.out.println( "La media de los números es " + media);
	
			}
			else if (op==4) {
				for (int i = 0; i < x.length; i++) {
				x[i] = in.nextInt(1);
				System.out.println( "Los resultados son " + x[i]);;
				}
			}else if (op==5) {
				for (int t = 0; t < x.length; t++) {
					int pe = Integer.parseInt(JOptionPane.showInputDialog("¿Qué numero deseas ver cuantas veces se repite?"));
					if(pe == x.length) ;
					contador ++;
					sum += x.length;
				System.out.println(contador);
				break;
				}				
			}
			else if(op==0) {
				controlBucle=false;
			}
			}while(!controlBucle);
		}
	}
