package pildoras_informaticas;

public class Manipulacion_de_cadena
{

	public static void main(String[] args) 
	{
		//lenght(): devuelve la longitud de una cadena de caracteres
		//charAt(n): devuelve una subcadena de un carácter dentro de una cadena (Las posiciones empiezan a contar de 0)
		//subsstring(x,y): devuelve una subcadena dentro de la cadena, siendo X el carácter a partir del cuál se extrae e Y el mº de caracteres que se quieren extraer
		//equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son. Distingue minusculas y mayusculas
		
		String nombre = "Adrián";
		System.out.println("Mi nombre es " + nombre);
		System.out.println( nombre + " tiene " + nombre.length() + " letras");
		System.out.println("La priemra letra de " + nombre + " es la " + nombre.charAt(0));
		//recordar que java empieza a contar desde 0, es decir mi nombre tiene A=0, d=1, r=2, i=3, a=4, n=5

	}

}
