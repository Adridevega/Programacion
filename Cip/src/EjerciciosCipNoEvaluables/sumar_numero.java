package EjerciciosCipNoEvaluables;
import java.util.*;
public class sumar_numero 
{

	public static void main(String[] args) 
	{

		int sum=sumarnumeros();
		System.out.println("El sumatorio es " + sum );
	}
	public static int sumarnumeros() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca el numero");
		int iNumero = sc.nextInt();
		int iSumatorio = 0;
		int iContador = iNumero;

			while (iContador != 0) 
			{
					   
			  iSumatorio = iSumatorio + iContador;
			  iContador--;
				 
			}
			return iSumatorio;
	}	
		

}

