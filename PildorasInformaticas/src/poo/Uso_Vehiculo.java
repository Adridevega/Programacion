package poo;
import java.util.*;

import javax.swing.JOptionPane;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1=new Coche();
		micoche1.establece_color(JOptionPane.showInputDialog("Introduce color: "));
		micoche1.configura_asientos(JOptionPane.showInputDialog("Introduce asiento: "));
		micoche1.configura_climatizador(JOptionPane.showInputDialog("Introduce climatizador"));
		System.out.println(micoche1.dime_datos_generales());
		System.out.println(micoche1.dime_color());
		Furgoneta mifurgoneta1= new Furgoneta(7, 580);//esto es distinto al coche porque si vemos la clase de furgoneta tiene dos parametros, que en este caso es plazas extras y capacidad de carga
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.configura_climatizador("Si");
		System.out.println(micoche1.dime_datos_generales()+" "+ micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales()+" "+ mifurgoneta1.dimeDatosFurgoneta());
	}

}
