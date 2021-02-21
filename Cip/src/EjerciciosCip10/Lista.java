package EjerciciosCip10;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Lista {

	public static void main(String[] args) {
		boolean salir=false;
		
		
		Scanner in= new Scanner(System.in);
		
		ArrayList<Persona>PL=new ArrayList<Persona>();
		
		PL.add(new Persona("Adrian", "Garcias santos", "111111111A", 23, 
				new Direccion("Los Olivos",38493,"Santa Cruz de Tenerife") ));
		PL.add(new Persona("Ana", "Mendez Nuñez", "222222222B", 22, 
				new Direccion("Los Pinos",38403,"Santa Cruz de Tenerife") ));
		PL.add(new Persona("Maria", "Sanchez Camacho", "333333333C", 45, 
				new Direccion("Franceces",38505,"Las Palmas") ));
		PL.add(new Persona("Julio", "Brito Gonzales", "444444444D", 30, 
				new Direccion("Los Pinos",38403,"Las Palmas") ));
		
				/*for(Persona e: PL) {
					System.out.println(e.dame_datosPersona());
				}*/
			Iterator<Persona>IP=PL.iterator();
			
			
				while(!salir) {
					
					int opciones = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción:"+ "\n" + 
							"Esta es la opción 1:Cargar datos "+ "\n" +
							"Esta es la opción 2:Listar todas las personas "+ "\n" +
							"Esta es la opción 3:Insertar "+ "\n" +
							"Esta es la opción 4:Eliminar "+ "\n" +
							"Esta es la opción 5:Contar "+ "\n" +
							"Esta es la opción 6:Salir "));
					//System.out.println("Eliga opcion que desea: ");
					//opciones=in .nextInt();
					
					switch (opciones) {
					case 1:
						
						salir=true;
						
						break;
					case 2:
						
						for(Persona e: PL) {
							System.out.println(e.dame_datosPersona());
						}
						
						salir=true;
						
						break;
					case 3:
						
						PL.add(new Persona(JOptionPane.showInputDialog("Introduce el nombre :"),
								JOptionPane.showInputDialog("Introduce el apellido :"),
								JOptionPane.showInputDialog("Introduce el DNI :"),
								Integer.parseInt(JOptionPane.showInputDialog("Introduce el edad :"))
								, new Direccion(JOptionPane.showInputDialog("Introduce la calle: "),
										Integer.parseInt(JOptionPane.showInputDialog("Introduce el CP:")),
										JOptionPane.showInputDialog("Introduce la provincia: "))));
						
						
						
						break;
					case 4:
						PL.remove(PL);
						
						salir=true;
						
						break;
					case 5:
					
						System.out.println("Hay "+PL.size()+" personas en la lista");
						
						salir=true;
						
						break;
					case 6:
						
						salir=true;
						
						break;
						

					default:
						System.out.println("Las opciones son entre 1, 5 o salir");
					}

				}
			
			
			/*while(IP.hasNext()) {
				System.out.println( IP.next().dame_datosPersona());
			}*/
	}
}
