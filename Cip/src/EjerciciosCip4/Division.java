package EjerciciosCip4;

import javax.swing.JOptionPane;

public class Division {

	public static void main(String[] args) {
		Float num1, num2, x;
		num1 = Float.parseFloat(JOptionPane.showInputDialog("numero 1"));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("numero 2"));
		x=num1/num2;
		System.out.println(String.format("%.2f", x));//forma de controlar la cantidad de decimales
	}

}
