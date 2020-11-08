package paqueteUdemy;
import java.security.*;

public class Tren {
		int vagones[][] = new int [5][2];
		String maquinista;
		int antiguedad;
		public Tren(String nombre, int anios) {
		for (int i = 0; i <= 4; i++) {
				vagones [i][0] = (i+1)*10;
				vagones [i][1] = 0 ;
		}
	
		maquinista = nombre;
		antiguedad = anios;
	
		}
		public void CompletarVagon(int vagon) {
			vagones[vagon][1] = vagones[vagon][0];
			System.out.println("el vago" + (vagon+1) + "ha sido completado");
		}
}

		
	
