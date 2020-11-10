package EjerciciosCip3;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		double peso ,IMC;
		double altura;
		peso= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso en kilogramos"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura en metros"));
		IMC = peso / Math.pow(altura, 2) ;
		System.out.println(IMC);
	}

}
