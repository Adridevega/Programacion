package EjerciciosCIP9;

public class Alumno extends Persona {
	
	private String curso;
	private double decuAlum;

	public Alumno(String nom, int agnoNacimiento, String curso ) {
		super(nom, agnoNacimiento);
		this.curso = curso;
		this.decuAlum=0.10;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}




	}
	/*public void calculaDescuentoAlum(double a) {
		descuento=a;
	}
	public double getCalculaDescuento(){
		double descuAlum=super.getCalculaDescuento();
		return descuAlum + descuento;
	}
	private double descuento;*/

