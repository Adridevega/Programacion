package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;
public class Separar {

	public static void main(String[] args) {
			float numero;
			numero= Float.parseFloat(JOptionPane.showInputDialog("Introduzca su número"));
			System.out.println("El número originalmente es:" +  numero);		  
		if(Math.floor(numero)-numero<0.5) {
				float x = Math.abs(numero);
				float parteDecimal = x % 1;
				System.out.println(" Parte decimal:" + parteDecimal);
				}
			else {
			float parteDecimal = numero % 1;
			System.out.println(" Parte decimal:" +   parteDecimal);
		}
	}
}
			

	
			

