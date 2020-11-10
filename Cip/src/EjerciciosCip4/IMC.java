package EjerciciosCip4;

import javax.swing.JOptionPane;

public class IMC 
{

	public static void main(String[] args) 
	{
		double peso ,IMC;
		double altura;
		peso= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso en kilogramos"));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura en metros"));
		IMC = peso / Math.pow(altura, 2) ;
		System.out.println(String.format("%.2f", IMC));
		if(IMC>=18 && IMC<=25) 
			{
			System.out.println("Estas saludable");
			}
			else 
			{
				if(IMC<18) 
				{
					System.out.println("Estas por debajo de tu IMC saludable");
				}
				else if(IMC>25) 
				{
					System.out.println("Estas por encima de tu IMC saludable");
				}	
			}

		}
	
}

