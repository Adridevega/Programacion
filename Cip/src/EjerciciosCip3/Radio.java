package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;
public class Radio {

	public static void main(String[] args) {
		double radio;
		double diametro;
		diametro=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el diametro de la circurferencia"));
		radio=diametro/2;
		System.out.println("el radio es " + radio);
	}

}
