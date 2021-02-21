package EjerciciosCIP9;

public class Profesor extends Persona {
	
		private double salario;
		private double decuProf;

		public Profesor(String nom, int agnoNacimiento, double salario) {
			super(nom, agnoNacimiento);
			this.salario = salario;
			this.decuProf=0.02;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}


		
		
}
