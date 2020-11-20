package EjerciciosCip3;
import java.math.BigDecimal;
import java.util.*;

import javax.swing.JOptionPane;
public class Separar {

	public static void main(String[] args) {
			float num= Float.parseFloat(JOptionPane.showInputDialog("Introduce un número con decimales"));
			BigDecimal d = BigDecimal.valueOf (num);
			BigDecimal result = d.remainder(BigDecimal.ONE);
			JOptionPane.showMessageDialog(null,"La parte decimal es " + String.format("%.2f", result));
			
	}
}
			

	
			

