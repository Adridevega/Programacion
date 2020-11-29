package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class nnota_letra {

	public static void main(String[] args) {
		boolean control;
		String numdefi;
		do {
		control=true;		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca número entre el 0 y 10"));
		switch (num) 
		{
			case 0:
				numdefi="Cero";
				break;
			case 1:
				numdefi="Uno";
				break;
			case 2:
				numdefi="Dos";
				break;
			case 3:
				numdefi="Tres";
				break;
			case 4:
				numdefi="Cuatro";
				break;
			case 5:
				numdefi="Cinco";
				break;
			case 6:
				numdefi="Seis";
				break;
			case 7:
				numdefi="Siete";
				break;
			case 8:
				numdefi="Ocho";
				break;
			case 9:
				numdefi="Nueve";
				break;
			case 10:
				numdefi="Diez";
				break;	
			default:
				numdefi="Numero no permitido";
				control=false;

			}
				JOptionPane.showMessageDialog(null, numdefi);
				} while (!control);
	}

}
