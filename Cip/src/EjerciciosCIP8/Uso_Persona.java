package EjerciciosCIP8;

import javax.swing.JOptionPane;

public class Uso_Persona {

	public static void main(String[] args) {
		Estudiante miestu1= new Estudiante();
		miestu1.setNombre(JOptionPane.showInputDialog("Escriba el nombre: "));	
		miestu1.setEdad( Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad:")));
		miestu1.setDireccion(JOptionPane.showInputDialog("Escriba la dirreción"));
		miestu1.setCodigo(JOptionPane.showInputDialog("Escribe el codigo"));
		
			System.out.println("El del primer alumeno nombre es "+miestu1.getNombre()+". "+"La edad es "+miestu1.getEdad()+"."
					+"La dirreción "+miestu1.getDireccion()+". "+"El codigo es "+miestu1.getCodigo());
		
		Estudiante miestu2= new Estudiante();
		miestu2.setNombre(JOptionPane.showInputDialog("Escriba el nombre: "));
		miestu2.setEdad( Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad:")));
		miestu2.setDireccion(JOptionPane.showInputDialog("Escriba la dirreción"));
		miestu2.setCodigo(JOptionPane.showInputDialog("Escribe el codigo"));
		
			System.out.println("El del segundo alumeno nombre es "+miestu2.getNombre()+". "+"La edad es "+miestu2.getEdad()+"."
				+"La dirreción "+miestu2.getDireccion()+". "+"El codigo es "+miestu2.getCodigo());
		
		EstudianteInt miestuin1= new EstudianteInt();
		miestuin1.setNombre(JOptionPane.showInputDialog("Escriba el nombre: "));	
		miestuin1.setEdad( Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad:")));
		miestuin1.setDireccion(JOptionPane.showInputDialog("Escriba la dirreción"));
		miestuin1.setNacionalidad(JOptionPane.showInputDialog("Escriba de que pais vienes: "));
		
		System.out.println("El del primer alumeno nombre es "+miestuin1.getNombre()+". "+"La edad es "+miestuin1.getEdad()+"."
				+"La dirreción "+miestuin1.getDireccion()+". "+miestuin1.dimeEuropa()+". "+miestuin1.descuentoParaJovenes());
		
		EstudianteInt miestuin2= new EstudianteInt();
		miestuin2.setNombre(JOptionPane.showInputDialog("Escriba el nombre: "));	
		miestuin2.setEdad( Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad:")));
		miestuin2.setDireccion(JOptionPane.showInputDialog("Escriba la dirreción"));
		miestuin2.setNacionalidad(JOptionPane.showInputDialog("Escriba de que pais vienes: "));
		
		System.out.println("El del primer alumeno nombre es "+miestuin2.getNombre()+". "+"La edad es "+miestuin2.getEdad()+"."
				+"La dirreción "+miestuin2.getDireccion()+". "+miestuin2.dimeEuropa()+". "+miestuin2.descuentoParaJovenes());
		
		EstudianteInt miestuin3= new EstudianteInt();
		miestuin3.setNombre(JOptionPane.showInputDialog("Escriba el nombre: "));	
		miestuin3.setEdad( Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad:")));
		miestuin3.setDireccion(JOptionPane.showInputDialog("Escriba la dirreción"));
		miestuin3.setNacionalidad(JOptionPane.showInputDialog("Escriba de que pais vienes: "));
		
		System.out.println("El del primer alumeno nombre es "+miestuin3.getNombre()+". "+"La edad es "+miestuin3.getEdad()+"."
				+"La dirreción "+miestuin3.getDireccion()+". "+miestuin3.dimeEuropa()+". "+miestuin3.descuentoParaJovenes());
			}

}
