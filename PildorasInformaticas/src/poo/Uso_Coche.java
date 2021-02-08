package poo;
import java.util.*;
public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche micoche=new Coche();
		micoche.establece_color("amarillo");
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
	}

}
