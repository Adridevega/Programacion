package EjerciciosCip4;

import java.util.function.Function;

public class Dados {

	public static void main(String[] args) {
		String jugador1;
		String jugador2;
		int res1, res2, res3, res4, total1, total2, media;
		
			int dado1=(int) (Math.random()*(7-1)+1) ;
			System.out.println("Primera tirada del primer jugador es: " + dado1);
			int dado2=(int) (Math.random()*(7-1)+1) ;
			System.out.println("Segunda tirada del primer jugador es: " + dado2);
			
				res1 = dado1 + dado2;
				System.out.println("El resultado del primer jugador es:" + res1);
				
			int dado3=(int) (Math.random()*(7-1)+1) ;
			System.out.println("Primera tirada del segundo jugador es: " + dado3);
			int dado4=(int) (Math.random()*(7-1)+1) ;
			System.out.println("Segunda tirada del segundo jugador es: " + dado4);
				
				res2 = dado3 + dado4;
				System.out.println("El resultado del segundo jugador es:" + res2);
				
				if(res1<res2) {
					System.out.println("***El segundo jugador tiene la tirada más alta de la primera ronda***");
				}
				else {
					System.out.println("***El primer jugador tiene la tirada más alta de la primera ronda***");
				}
				int dado5=(int) (Math.random()*(7-1)+1) ;
				System.out.println("Primera tirada del primer jugador es: " + dado5);
				int dado6=(int) (Math.random()*(7-1)+1) ;
				System.out.println("Segunda tirada del primer jugador es: " + dado6);
				
					res3 = dado5 + dado6;
					System.out.println("El resultado del primer jugador es:" + res3);
					
				int dado7=(int) (Math.random()*(7-1)+1) ;
				System.out.println("Primera tirada del segundo jugador es: " + dado7);
				int dado8=(int) (Math.random()*(7-1)+1) ;
				System.out.println("Segunda tirada del segundo jugador es: " + dado8);
					
					res4 = dado3 + dado4;
					System.out.println("El resultado del segundo jugador es:" + res4);
					
					if(res3<res4) {
						System.out.println("***El segundo jugador tiene la tirada más alta de la segunda ronda***");
					}
					else {
						System.out.println("***El primer jugador tiene la tirada más alta de la segunda ronda***");
					}
						total1=res1+res3;
						total2=res2+res4;
							if(total1<total2){
								System.out.println("El ganados definitivo es el jugado 2");
							}
							else {
								System.out.println("El ganados definitivo es el jugado 1");
							}
							
								media=(res1+res2+res3+res4)/4;
								System.out.println("La media de todas las tiradas es " + media);
					
			
	}

}

