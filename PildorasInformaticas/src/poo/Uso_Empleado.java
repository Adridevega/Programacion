package poo;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Empleado[] misEmpleados= new Empleado[3];
		misEmpleados[0]= new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1]= new Empleado("Luisa Carmen", 100000, 1997, 2, 17);
		misEmpleados[2]= new Empleado("Garcilaso", 95000, 2000, 10, 9);
		
		for(Empleado e: misEmpleados) {
			System.out.println("Escriba el aumento de "+ e.dimeNombre());
			double aument = in.nextDouble();
			e.subeSueldo(aument);
		}
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: "+ e.dimeNombre()+
					". Sueldo: "+e.dimeSueldo()+
					". Fecha de alta: " +e.dimeFechaContrato());
		}
	}

}
class Empleado{
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	public String dimeNombre() {
		return nombre;
	}
	public double dimeSueldo() {
		return sueldo;
	}
	public Date dimeFechaContrato() {
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo-porcentaje/100;
		sueldo+=aumento;//es la suma del aumento mas el sueldo es como decir sueldo mas aumento
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
	

	
