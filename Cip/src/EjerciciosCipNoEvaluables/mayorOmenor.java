package EjerciciosCipNoEvaluables;
import java.util.*;
import javax.swing.JOptionPane;
public class mayorOmenor {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número"));
		if (num < num2) {
		JOptionPane.showMessageDialog(null, "El pimer número es menos que el segundo");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "El pimer número es mayor que el segundo");
		}
	}

}
