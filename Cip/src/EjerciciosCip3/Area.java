package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;
public class Area {

	public static void main(String[] args) {
		double Pi= 3.1416 ,radio ,area;
		radio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio"));
		area = Pi * Math.pow(radio, 2);
		System.out.println("El area es " + area);

	}

}
