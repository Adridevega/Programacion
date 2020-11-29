package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
    	int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"));
        JOptionPane.showMessageDialog(null, "El factorial de " + num + " es " + factorial(num) );
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

