package EjerciciosCip4;

import javax.swing.JOptionPane;

public class Menor {

	public static void main(String[] args) {
		double num1, num2;
		num1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero"));
		System.out.println(Math.min(num1, num2));
	}

}
