package EjerciciosCipNoEvaluables;
import java.util.*;
import javax.swing.JOptionPane;
public class mayorOmenor {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer n�mero"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo n�mero"));
		if (num < num2) {
		JOptionPane.showMessageDialog(null, "El pimer n�mero es menos que el segundo");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "El pimer n�mero es mayor que el segundo");
		}
	}

}
