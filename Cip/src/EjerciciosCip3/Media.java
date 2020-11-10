package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;
public class Media {

	public static void main(String[] args) {
		double num1, num2, num3, media;
		num1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número"));
		num3=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el tercer número"));
		media= (num1 + num2 + num3) / 3;
		System.out.println("La media es "+media );
		
	}

}
