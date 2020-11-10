package EjerciciosCip4;

import javax.swing.JOptionPane;

public class Radio {

	public static void main(String[] args) {
		double radio ,area;
		radio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio"));
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area es " + area);
	}

}
