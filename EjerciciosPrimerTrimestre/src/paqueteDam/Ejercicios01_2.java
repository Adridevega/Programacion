package paqueteDam;
import java.util.*;
public class Ejercicios01_2 
{

	public static void main(String[] args) 
	{
		double cuota_fija = 6;
		double cuato_anual= cuota_fija * 12;
		double litros;
		Scanner in = new Scanner (System.in);
		System.out.println("Introduzca la cantidad de litros que gasta al mes:");
		litros=in.nextDouble();
		if (litros<=50) 
		{
			System.out.println("No hay precio extra el precio es " + cuota_fija);
		}
		if( litros>50 && litros<=200 ) 
		{
			double primera_opcion = litros  * 0.1;
			System.out.println("La cantidad de litros usada es superior a 50, se activa primera opcion. El precio es " + primera_opcion);
		}
		if(litros>200)
		{
			double seungda_opcion = litros * 0.3;
			System.out.println("La cantidad de litros usada es superior a 200, se activa segunda opcion. El precio es " + seungda_opcion);


		}
	}

}
