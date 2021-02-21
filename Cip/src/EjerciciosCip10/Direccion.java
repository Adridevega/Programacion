package EjerciciosCip10;

public class Direccion {
	
	protected String calle;
	protected int cp;
	protected String provincia;
	
	public Direccion(String calle, int cp,String provincia) {
		
		this.calle = calle;
		this.cp = cp;
		this.provincia = provincia;
		
	}

		public String getCalle() {
			return calle;
		}
	
		public void setCalle(String calle) {
			this.calle = calle;
		}
	
		public int getCp() {
			return cp;
		}
	
		public void setCp(int cp) {
			this.cp = cp;
		}
	
		public String getProvincia() {
			return provincia;
		}
	
		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		
		public String dame_datosDirrecion() {
			return "Direccion calle=" + calle + ", cp=" + cp + ", provincia=" + provincia ;
		}

}
