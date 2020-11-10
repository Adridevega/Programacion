package EjerciciosCip2;
import java.util.*;

import javax.swing.JOptionPane;
public class Datos {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		String nombre="";
		int edad;
		String modulo="";
		nombre=JOptionPane.showInputDialog("Introduzca su nombre");
		edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad:"));
		do {
			modulo=JOptionPane.showInputDialog("Introduce si eres del modulo de DAM o DAW");
		}while(modulo.equalsIgnoreCase("DAM" )==false && modulo.equalsIgnoreCase("DAW")==false);
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(modulo);
	}

}
