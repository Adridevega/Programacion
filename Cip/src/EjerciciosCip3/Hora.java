package EjerciciosCip3;
import java.util.Calendar;
import javax.swing.JOptionPane;
public class Hora {

	public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int hora, suma, res;
        hora=Integer.parseInt(JOptionPane.showInputDialog("�Cual es la hora actual?"));
        suma=Integer.parseInt(JOptionPane.showInputDialog("�Cuantas horas quieres a�adir?"));
	       
        	calendario.set(Calendar.HOUR_OF_DAY, hora);
	        calendario.add(Calendar.HOUR_OF_DAY, suma);
	        res = calendario.get(Calendar.HOUR_OF_DAY);
	        System.out.println("La hora actual es " + hora + " y con la suma es " + res);

    }
}

