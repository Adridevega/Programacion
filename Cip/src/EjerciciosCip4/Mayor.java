package EjerciciosCip4;

import javax.swing.JOptionPane;

public class Mayor {

	public static void main(String[] args) {
		double num1, num2;
		num1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero"));
		System.out.println(Math.max(num1, num2));
	}

}
