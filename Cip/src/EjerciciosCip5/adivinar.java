package EjerciciosCip5;
import java.util.*;
import javax.swing.JOptionPane;
public class adivinar {
	public static void main(String[] args) {
		Random in = new Random();
		int adiv = in.nextInt(101); 
		int i = 0; 
		int num = Integer.parseInt(JOptionPane.showInputDialog("Por favor introduzca un n�mero:"));
		while (adiv != num) { 
			i++; 
			if (adiv > num) {
				num = Integer.parseInt(JOptionPane.showInputDialog("El n�mero generado es mayor que " + num));
			} else {
				num = Integer.parseInt(JOptionPane.showInputDialog("El n�mero generado es menor que " + num));
			}
		}
		JOptionPane.showMessageDialog(null, "Perfecto! Ha adivinado el n�mero secreto,\n El n�mero de intentos para adivinar el n�mero secreto ha sido de " + i);
	}
}