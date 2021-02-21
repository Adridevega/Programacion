package poo;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados= new Empleado[7];
		misEmpleados[0]= new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1]= new Empleado("Luisa Carmen", 100000, 1997, 2, 17);
		misEmpleados[2]= new Empleado("Garcilaso", 95000, 2000, 10, 9);
		misEmpleados[3]= new Empleado("Antonio");//esto es posible por la sobrecarga de constructores
		misEmpleados[5]= jefe_RRHH; //poliformismo 
		misEmpleados[6]= new Jefatura("Maria", 95000, 1999, 5, 26);
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
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
	public Empleado(String nom) {
		
		this(nom, 30000, 2000,01,01);
		
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
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;//es la suma del aumento mas el sueldo es como decir sueldo mas aumento
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}

class Jefatura extends Empleado{

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double dimeSueldo() {
		double sueldoJefe=super.dimeSueldo();
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
}
	

	
