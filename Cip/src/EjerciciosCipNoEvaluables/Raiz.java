package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class Raiz {
	public static void main(String[] args) {
		boolean control;
		do {
			control=false;
			int n= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número")); 
			if (n>0) {
		JOptionPane.showMessageDialog(null, "La raiz cuadrada es " +calcularRaiz(n));
			} else {
				control=true;
			}
		} while (!control);
	}

	public static double calcularRaiz(int N) {
		return Math.sqrt(N);
	}

}
