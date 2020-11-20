package EjerciciosCip4;
import java.util.*;
public class Dados {

	
		public static void main(String[] args) 
		{
	        Scanner sc = new Scanner(System.in);
	        double dados[];
	        double tm = 0;
	        int ta = 0;
	        int j1 = 0;
	        int j2 = 0;

	        dados = new double[4];
	        for (int r = 0; r <2 ; r++) 
	        {
				
		        for (int t = 0; t < dados.length; t++) 
		        {
		            dados[t] = Math.random()* (6 - 1) +1;
	
		            if(t < dados.length/2) 
		            {
		                j1 += Math.round(dados[t]);
		                System.out.println("La tirada del jugador 1 es: " + Math.round(dados[t]) + ".");
		            }
		            else 
		            {
		                j2 += Math.round(dados[t]);
		                System.out.println("La tirada del jugador 2 es: " + Math.round(dados[t]) + ".");
		            }
	
		            tm += Math.round(dados[t]);
			        }
		
			        if(j1>j2) 
			        {
			            System.out.println("La Tirada más alta es: " + j1 + ".");
			            System.out.println("El ganador es el jugador 1.");
			        }
			        else
			        {
			            System.out.println("La Tirada más alta es: " + j2 + ".");
			            System.out.println("El ganador es el jugador 2.");
			        }
		
				        tm /= dados.length;
				        System.out.println("La medía de las tiradas es : " + Math.round(tm) + ".");
	    	}

    }

}



