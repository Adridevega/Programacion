package pildoras_informaticas;
import java.util.*;
public class Paquetes {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce tu nomre");
			String nombre_usuario=entrada.nextLine();
			System.out.println("Introduce la edad");
			int edad_usuario=entrada.nextInt();
				System.out.println("Hola " + nombre_usuario + " de edad "+ edad_usuario +" el proximo año trendrás " + (edad_usuario +1) + " años");
	}

}
