package poo;

public class Coche 
{
//al poner la variable en privado esta se encapsula, siendo visible y modificable
	//solo desde la misma clase 
		private int ruedas;
		private int largo;
		private int ancho;
		private int motor;
		private int peso_plataforma;
		private String color;
		private int peso_total;
		private boolean asientos_cuero, climatizador;
		
		
		//constructor
		public Coche()
		{
			ruedas=4;
			largo=2000;
			ancho=300;
			motor=1600;
			peso_plataforma=500;
					
		}
		//en caso de querer un numero entero seria int, pero queremos que nos devuelva una frase
		//esto es un getter, informar de dato
		public String dime_datos_generales() {
			return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + 
		". Mide "+ largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de "+
		peso_plataforma + " kg";
		}
		//esto es un setter, modificador de dato
		public void establece_color(String color_coche) {
			color=color_coche;
			
		}
		public String dime_color() {
			return "El color del coche es " + color;
		}

}
