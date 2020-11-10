package EjerciciosCip3;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import java.util.*;
public class Hora {

	public static void main(String[] args){
		int h =0;
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			Date tempDate = cal.getTime();
			System.out.println("Fecha actual: " + tempDate);
			
				h=Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuanto horas de más quiere introducir"));
				cal.set(Calendar.HOUR, cal.get(Calendar.HOUR)+ h);
				tempDate = cal.getTime();
				System.out.println("Hora modificada: " + tempDate);
				System.out.println("Han pasado " + h + " horas");
		  }    
		}    

