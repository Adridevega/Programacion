package paqueteUdemy;
import paqueteUdemy.Tren;
public class Objetos {

	public static void main(String[] args) {
		//Tren primero = new Tren();//da error por como esta  echo el constructor
		Tren segundo = new Tren("Juan", 25);
		System.out.println(segundo.antiguedad);
		segundo.CompletarVagon(2);
		System.out.println(segundo.vagones[2][1]);
	}

}
