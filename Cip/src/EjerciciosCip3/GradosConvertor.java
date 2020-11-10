package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;
public class GradosConvertor {

	public static void main(String[] args) {
		double C;
		double F;
		C=Double.parseDouble(JOptionPane.showInputDialog("Introduzca grados Celsius"));
		F = C * (9/5) + 32;
		System.out.println(F + " grados Fahrenheit");

	}

}
