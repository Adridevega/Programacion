 package Arraylist;
 
 import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado listaEmpleado[]= new Empleado[3];
		listaEmpleado[0]= new Empleado ("Ana", 45, 2500);
		listaEmpleado[1]= new Empleado ("Antonio", 55, 2000);
		listaEmpleado[2]= new Empleado ("Maria", 25, 2600);*/
		
		ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
		
		listaEmpleado.add(new Empleado("Ana", 45, 2500));
		listaEmpleado.add(new Empleado("Antonio", 55, 2000));
		listaEmpleado.add(new Empleado("Maria", 25, 2600));
		
		/*for(Empleado e: listaEmpleado) {
			System.out.println(e.dameDatos());
		}*/
		
		Iterator<Empleado> mi_iterador=listaEmpleado.iterator();
		
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos());
		}
		
		

	}

}

	class Empleado{
		
		public Empleado(String nombre, int edad, double sueldo) {
			
			this.nombre = nombre;
			this.edad = edad;
			this.sueldo = sueldo;
			
		}
		
		public String dameDatos() {
			return "Empleado nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo ;
		}

		protected String nombre;
		protected int edad;
		protected double sueldo;
	}
