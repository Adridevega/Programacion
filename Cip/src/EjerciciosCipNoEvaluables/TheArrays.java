package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class TheArrays {

	public static void main(String[] args) {
		int mayor;
		int[]num= { 1, 524, 423, 825, 1524, 324, 899, 975, 775, 657};
		mayor=num[0];
		for(int i=0; i<num.length ; i++){
		 if(num[i]>mayor){ 
             mayor = num[i];  
         }
	}
		JOptionPane.showMessageDialog(null, "El número más grande de la Arrays es " + mayor);

}
}
