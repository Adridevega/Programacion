package paqueteUdemy;
import java.util.*;
public class Switchs {

	public static void main(String[] args) {
		int mes;	
		Scanner in = new Scanner (System.in);
		System.out.println("A�ada el mes deseado: ");
		mes = in.nextInt(); 
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
				System.out.println("Tienen 31 dias");
				break;
				
			case 4:
			case 6:
			case 8:
			case 10:
			case 12:
				System.out.println("Tienen 30 dias");
				break;
			//en el defecto de que no es nada pues se pone default	
			default: System.out.println("Tiene 28 d�as ");
		}
		
	}

}