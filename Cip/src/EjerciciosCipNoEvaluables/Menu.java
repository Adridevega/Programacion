package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		String[] botones = {"Raiz", "Cuadrado","Salir"};

		int ventana = JOptionPane.showOptionDialog(null, 
				"Elija una opcióm", 
				"Menú", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				botones, 
				botones[0]);
		if (ventana==0) {
			double num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca un numero: "));
			JOptionPane.showMessageDialog(null, "El cuadrada es " +calcularRaiz(num1)); 
			
		}
		else if (ventana==1) {
			double num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca un numero: "));
			JOptionPane.showMessageDialog(null, "La raiz cuadrada es " +calcularCuadrado(num2)); 
		}
		else if (ventana==2) {
			JOptionPane.showMessageDialog(null, "Saliendo");
		}
	
	}
	public static double calcularRaiz(double N) {
		return Math.sqrt(N);
	}
	public static double calcularCuadrado(double num2) {
		return Math.pow(num2,2 );
		
	}

}
