package EjerciciosCIP8;

public class Estudiante extends Persona {
	private String codigo;
	
	public Estudiante() {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + "]";
	}
	

}
