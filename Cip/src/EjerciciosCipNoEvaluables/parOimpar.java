package EjerciciosCipNoEvaluables;
import java.util.*;
import javax.swing.JOptionPane;
public class parOimpar {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("�Qu� n�mero quieres saber si es par o impar?"));
		if (num%2==0) {
			JOptionPane.showMessageDialog(null, "El n�mero es par");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "El n�mero es impar");

			
			
		}
	}

}
