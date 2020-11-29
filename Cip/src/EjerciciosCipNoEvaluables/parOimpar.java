package EjerciciosCipNoEvaluables;
import java.util.*;
import javax.swing.JOptionPane;
public class parOimpar {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("¿Qué número quieres saber si es par o impar?"));
		if (num%2==0) {
			JOptionPane.showMessageDialog(null, "El número es par");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "El número es impar");

			
			
		}
	}

}
