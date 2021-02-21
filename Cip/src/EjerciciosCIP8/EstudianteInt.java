package EjerciciosCIP8;

import java.util.Arrays;

public class EstudianteInt extends Persona{
	private Boolean esEramus;
	private String nacionalidad;
	private boolean pais;
	private boolean descuento;
	String paisesEU[]= {"ALEMANIA", "AUSTRIA", "BÉLGICA","BULGARIA","CHIPRE","CROACIA","DINAMARCA","ESLOVENIA","ESPAÑA","ESTONIA"
			,"FINLANDIA","FRANCIA","GRECIA","HUNGRÍA", "IRLANDA", "ITALIA", "LETONIA",
			"LITUANIA", "LUXEMBURGO", "MALTA", "PAÍSES BAJOS", "POLONIA", "PORTUGAL","REPÚBLICA CHECA",
			"POLONIA", "PORTUGAL", "REPÚBLICA CHECA", "REPÚBLICA ESLOVACA", "RUMANÍA", "SUECIA"};
	
	public EstudianteInt() {
		super();
		this.esEramus = esEramus;
		this.nacionalidad = nacionalidad;
	}
	public Boolean getEsEramus() {
		return esEramus;
	}
	public void setEsEramus(Boolean esEramus) {
		this.esEramus = esEramus;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	private void tomaEuropeo(String pais) {
		for (String cadena : paisesEU) {
			if(cadena.equalsIgnoreCase(nacionalidad)) {
				this.pais=true;
			}else {
				this.pais=false;
			}
		}
		
	}
	public  String dimeEuropa() {
		for (String cadena : paisesEU) {
			if(cadena.equalsIgnoreCase(nacionalidad)) {
				return "Es Europeo puede hacer Erasmus";
			}
				return "No es Europeo no puede hacer Erasmus";
			
		}
		return nacionalidad;
		
		
	}
	public void dimeDescuentoParaJovenes(String descuento) {
		if (pais==true && getEdad()<25) {
			this.descuento=true;
		}else {
			this.descuento=false;
		}
	}
	public String descuentoParaJovenes() {
		if (descuento==true) {
			return "Obtiene descuento";
		}
		return "No obtiene descuento";
	}
	@Override
	public String toString() {
		return "EstudianteInt [esEramus=" + esEramus + ", nacionalidad=" + nacionalidad + ", pais=" + pais
				+ ", descuento=" + descuento + ", paisesEU=" + Arrays.toString(paisesEU) + "]";
	}
}
