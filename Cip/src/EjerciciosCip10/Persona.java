package EjerciciosCip10;

public class Persona {

		protected String nombre;
		protected String apellido;
		protected String DNI;
		protected int edad;
		protected Direccion dirrecion;
		
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public Direccion getDirrecion() {
			return dirrecion;
		}

		public void setDirrecion(Direccion dirrecion) {
			this.dirrecion = dirrecion;
		}

		public Persona(String nombre, String apellido, String dNI, int edad, Direccion dirrecion) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			DNI = dNI;
			this.edad = edad;
			this.dirrecion = dirrecion;
			
		

		}

		
		public String dame_datosPersona() {
			return "Persona: nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", edad=" + edad
					+ ", dirrecion=" + this.getDirrecion().dame_datosDirrecion();
		}

	
		
		
}

