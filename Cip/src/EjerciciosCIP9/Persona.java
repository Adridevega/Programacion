package EjerciciosCIP9;

 public class Persona {

	public Persona(String nom, int agnoNacimiento) {
		nom=nombre;
		agnoNacimiento=nacer;
		
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNacer() {
		return nacer;
	}
	public void setNacer(int nacer) {
		this.nacer = nacer;
	}
			
	public double getCalculaDescuento() {
		return calculaDescuento;
	}
	public void setCalculaDescuento(double precio) {
		
	}



	protected String nombre;
	protected int nacer;
	protected double calculaDescuento;
	private double descuento;
}
