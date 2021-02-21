package poo;

public class Prueba {

		public static void main(String[]arg) {
			
			Empleados trabajador1=new Empleados("Paco");
			Empleados trabajador2=new Empleados("Ana");
			Empleados trabajador3=new Empleados("Antonio");
			Empleados trabajador4=new Empleados("María");

			trabajador1.setSeccion("RRHH");
			
				System.out.println(trabajador1.devuelveDatos() + "\n" + 
						trabajador2.devuelveDatos() + "\n"+ 
						trabajador3.devuelveDatos()+"\n"+
						trabajador4.devuelveDatos());
				
				System.out.println(Empleados.dameIdSiguiente());
						
				
		}
}


class Empleados{

	private String seccion;
	protected String nombre;
	private int Id;
	private static int IdSiguiente=1;
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administración";
		Id=IdSiguiente;
		IdSiguiente++;
	}

		public String getSeccion() {
			return seccion;
		}
		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String devuelveDatos() {
			return "El nombre es: "+nombre+" la sección es "+seccion+" y el Id es: "+Id;
		}
		public static String dameIdSiguiente() {
			return "El siguiente Id es: " + IdSiguiente;
			
		}
}
