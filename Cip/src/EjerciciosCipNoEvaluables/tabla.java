package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class tabla 
{
	public static void main(String main[]){

		int tabla=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero deseado"));

		String cadena="";

		for(int i=1;i<=10;i++){

			cadena+=tabla+"x"+i+"="+(i*tabla)+"\n";

		}

		JOptionPane.showMessageDialog(null, cadena,"Resultado", 1);

		}

		
}


