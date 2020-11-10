package EjerciciosCip2;
import java.util.*;

import javax.swing.JOptionPane;
public class CAritmetica {

	public static void main(String[] args) {
		int datol, dato2, dato3, resultado;
		/*datol = 20;
		dato2 = 10;
		dato3 = 10;*/
		datol=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su dato1:"));
		dato2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su dato2:"));
		dato3=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su dato3:"));
		// Suma
		resultado = datol + dato2 + dato3;
		System.out.println(datol + " + " + dato2 + " + " + dato3 + " = " + resultado);
		// Resta
		resultado = datol - dato2 - dato3;
		System.out.println(datol + " - " + dato2 + " - " + dato3 + " = " + resultado);
		// Producto
		resultado = datol * dato2 * dato3;
		System.out.println(datol + " * " + dato2 +  " * " + dato3 + " = " + resultado);
		// Cociente
		resultado = datol / dato2 / dato3;
		System.out.println(datol + " / " + dato2 + " / " + dato3 + " = " + resultado);
	}
}


