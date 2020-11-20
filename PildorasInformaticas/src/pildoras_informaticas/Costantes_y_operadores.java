package pildoras_informaticas;

public class Costantes_y_operadores {
	public static void main(String[] args) {
		/*int a = 5;
		int b;
		b=7;
		int c = b + a;
		c+= 6; // con lo que se ha hecho aqui es que el resultado de c se le sume seis
		System.out.println(c);*/
		
			//final int c=5;
			//c=7; Si este codigo se pone luego de un final int  (en este caso) java daria error ya que el final muestra que la variable es fija y no puede ser sustituida
			final double apulgadas= 2.54;
			double cm = 6;
			double res = cm/apulgadas;
			System.out.println("En " + cm + " hay " + res + " pulgadas");
	}

}
