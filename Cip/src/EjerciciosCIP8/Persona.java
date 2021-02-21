package EjerciciosCIP8;
public class Persona {
	protected String nombre;
	protected String direccion;
	protected int edad;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String MayorEdad() {
		if(edad>=18==true) {
			return "Es mayor de edad";
		}else {
			return "No es mayor de edad";
		}
	}

}
