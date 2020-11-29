package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class masOmenos {

	public static void main(String[] args) {
		boolean control;
		do {
			control=false;
			double n=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número"));
			if (n>0 && n!=0) {
				JOptionPane.showMessageDialog(null, "Es positivo","Resultado", 1);
				
			}
			else if (n<0 && n!=0) {
				JOptionPane.showMessageDialog(null, "Es negativo","Resultado", 1);
			}
			else if (n==0) {
				control=true;
			}
		} while (!control);
	}

}
