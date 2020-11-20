package pildoras_informaticas;

public class Mathes {

	public static void main(String[] args) {
			//math.sqrt(n): raiz cuadrada de un número
			//math.pow(base, exponenete): potencia de un núero. Pase y explonentes son doubles
			//math.sin(angulo) math.con(angulo), math.tan(angulo), math.atan(angulo)
			//math.round(decimal): redondeo de un numero
			//math.PI: contiene el numero PI
		/*double raiz= Math.sqrt(9);
		System.out.println(raiz);*/
		
			
		/*	float num1 = 5.85f; 
			//recordar la f cada vez que se haga un float
			int resultado = Math.round(num1);
			//esto se puede hacer aunque sea un numero decilmal ya que en la ayuda a la hora de hacer el math decia parar un float a un int
			//aunque se pueden poner ambos double y saldria el resultado pero con un decimal, en el caso de querer hacer si o si un double se deberia poner =(int) Math.round(num1)
			//lo que se acaba de enseñar con ell(int) es una refundición
			System.out.println(resultado);*/
		
		
				double base = 5;
				double expo = 3;
				int res = (int) Math.pow(base, expo);
				//esto solo se hace cuando si o si la variable debe de ser int (por lo menos en ese ejemplo) la refundicion es para forzar la variable
				System.out.println(res);
	}

}
