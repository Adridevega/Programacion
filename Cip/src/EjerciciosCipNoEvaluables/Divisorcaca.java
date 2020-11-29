package EjerciciosCipNoEvaluables;
import java.util.*;
import javax.swing.JOptionPane;
public class Divisorcaca {

	public static void main(String[] args) {
		int i= 0;
		double divid= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el dividendo"));
		double divis= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el divisor"));
		double res = divid/divis;
			while(divis==0){
				i++;
				JOptionPane.showInternalMessageDialog(null, "no puede dividirse un número entre cero");
				break;
			}
				JOptionPane.showInternalMessageDialog(null, "El resultado es : " + res);

	}

}
