package EjerciciosCip7;
import java.util.*;

import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) 
	{
		
		libro libro1=new libro();
		libro libro2=new libro();
		Scanner in=new Scanner(System.in);
		String titulo=JOptionPane.showInputDialog("Introduzca el titulo del libro");
		String autor=JOptionPane.showInputDialog("Introduzca el autor del libro");
		int cantidadPrestados=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de libros que han sido prestados"));
		int cantidadDeEjemplares=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de ejemplares"));
		
			libro1.setAutor(autor);
			libro1.setTitulo(titulo);
			libro1.setCantidadDeEjemplares(cantidadDeEjemplares);
			libro1.setCantidadPrestados(cantidadPrestados);
			libro1.darPrestamo();
			libro1.devuelveLibro();
				if(libro1.darPrestamo()) 
				{
					System.out.println("Se puedo prestar el libro "+ libro1.getTitulo());
				}
				else 
				{
					System.out.println("No querdan ejemplares del libro "+ libro1.getTitulo() );
				}
				if (libro1.devuelveLibro()) 
				{
					System.out.println("Se ha devuelto el "+ libro1.getTitulo());
				}
				else {
					System.out.println("No hay ejemplares de "+ libro1.getTitulo()+ " a devolver");
				}
				System.out.println("Se han prestado "+ libro1.getCantidadPrestados()+" del " + libro1.getTitulo());
			
	}

}
