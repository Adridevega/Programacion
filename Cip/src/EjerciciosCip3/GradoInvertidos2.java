package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;
public class GradoInvertidos2 {

	public static void main(String[] args) {
		double C;
		double F;
		F=Double.parseDouble(JOptionPane.showInputDialog("Introduzca grados Fahrenheit"));
		C = (F-32)*5/9;
		System.out.println(C + " grados Celsius ");

	}

}
