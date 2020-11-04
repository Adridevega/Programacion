package paqueteDam;
import java.util.Scanner;

public class Cifras {

static Scanner in = new Scanner(System.in);

static public void main(String[] args) {
	//Use double en vez de int para si el usuario quiere poner decimales poder informar más adelante del error
	double num;
	//Aquí al ser números romanos se pondrán como letras y va a ser necesarios utilizar String para que nos devuelvan textos
	String un = "";
	String de = "";
	String ce = "";
	String mi = "";
	//Con[] estamos declarando la Arrays en este caso com se le puso el int delante estamos adelantado que sera de numeros enteros
	//El new int[4] nos informa de cuantos "cajones" o longitud es la arrays
	int[] numero = new int[4];

	
	System.out.print("Ingrese numero entre 1 y 9999 para ser convertido en romano: ");
	num = in.nextDouble();
	//Aqui estamos los codigos para informar del error
	if(num%1 != 0) {
		System.out.println("Los numeros romanos no pueden tener decimales");
	}else {
		//Aqui esta el codigo que "casteará" de double a int para poder proseguir con el calculo habitual
		int numInteger = (int) num;
	
	
	//Aqui se ve donde actua la arrays viendo los "cajones"
	numero[0] = numInteger / 1000;
	numero[1] = (numInteger % 1000) / 100;
	numero[2] = ((numInteger % 1000) % 100) / 10;
	numero[3] = (((numInteger % 1000) % 100) % 10);
	//En este caso en especial, a diferencia de los demás, se usara un For para poder crear un bucle; ya que, aunque los romanos solo hicieron hasta el 3999
	//La forma correcta sería poner una linea encima pero en este caso se multiplica las M por cada 1000 que haya. Por eso es tan util un For 
	for (int i = 1; i <= numero[0]; i++) {
	    mi = mi + "M";
	}
	//Ya luego de tener los Mil cubiertos se usará un switch ya que el limite es de 1 al 9, yendo caso por caso hasta completar el número
	//Aquí los centenares
	switch (numero[1]) {
		case 1:
			ce += "C";
				break;
		case 2:
			ce += "CC";
				break;
		case 3:
			ce += "CCC";
				break;
		case 4:
			ce += "CD";
				break;
		case 5:
			ce += "D";
				break;
		case 6:
			ce += "DC";
				break;
		case 7:
			ce += "DCC";
				break;
		case 8:
			ce += "DCCC";
				break;
		case 9:
			ce += "CM";
				break;
							}
	//Aqui las decenas
	switch (numero[2]) {
		case 1:
			de += "X";
				break;
		case 2:
			de += "XX";
				break;
		case 3:
			de += "XXX";
				break;
		case 4:
			de += "XL";
				break;
		case 5:
			de += "L";
				break;
		case 6:
			de += "LX";
				break;
		case 7:
			de += "LXX";
				break;
		case 8:
			de += "LXXX";
				break;
		case 9:
			de += "XC";
				break;
							}
	//Aqui las unidades
	switch (numero[3]) {
		case 1:
			un += "I";
				break;
		case 2:
			un += "II";
				break;
		case 3:
			un += "III";
				break;
		case 4:
			un += "IV";
				break;
		case 5:
			un += "V";
				break;
		case 6:
			un += "VI";
				break;
		case 7:
			un += "VII";
				break;
		case 8:
			un += "VIII";
				break;
		case 9:
			un += "IX";
				break;
						}
	//Y al llegar a este punto el número esta completado
	System.out.println("Su numero " + num + " en romano es: " + mi + ce + de + un);
	}
}
}
