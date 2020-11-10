package EjerciciosCip3;

import javax.swing.JOptionPane;

public class Redondeo {
	public static void main(String[] args) {
		double num1, x;
		int y, a;
		num1= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el númerp a redondear"));
		x = num1 - Math.floor(num1);
		if(x>0.5) {
			y= (int) Math.floor(num1+1);
			System.out.println(y);
		}
		else {
			a= (int) (num1 - x);
			System.out.println(a);
		}
	}

}
