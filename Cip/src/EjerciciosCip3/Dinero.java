package EjerciciosCip3;
import java.util.*;

import javax.swing.JOptionPane;

public class Dinero 
{
	public static void main(String[] args) 
	{	
		double dolar;
		double euro;
		euro=Double.parseDouble(JOptionPane.showInputDialog("¿Que cantidad de euros quieres convertir?"));
		dolar=euro*1.17;
		System.out.println(dolar);
		
	}
}