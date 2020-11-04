package paqueteDam;

import java.util.Scanner;
public class Ejercicio01_3 
{
 public static void main(String[] args) 
 {
  Scanner teclado=new Scanner (System.in);
        int hora, min, seg;
        System.out.println("Ingrese una medida de tiempo expresada en horas, minutos y segundos con valores arbitrarios, primero ingrese las horas");
        hora = teclado.nextInt();
        System.out.println("Ingrese los minutos");
        min = teclado.nextInt();
        System.out.println("Ingrese los segundos");
        seg = teclado.nextInt();
        while(seg>=60){
            seg=seg-60;
            min=min+1;
           }
        while(min>=60){
            min=min-60;
            hora=hora+1;
           }
        System.out.println("La expresión correcta es: "+hora+" horas "+min+" minutos y "+seg+" segundos.");
 }
 }
