package EjerciciosCip2;
import java.util.*;

import javax.swing.JOptionPane;
public class Saludo {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String nombre, apellidos= "";
		nombre=JOptionPane.showInputDialog("Introduzca su nombre");
		apellidos=JOptionPane.showInputDialog("Introduzca su apellido");
		System.out.println("Buenos dias");
		System.out.println("Su nombre es " + nombre + apellidos);
	}

}
