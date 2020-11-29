package EjerciciosCipNoEvaluables;

import javax.swing.JOptionPane;

public class notas 
{

	public static void main(String[] args) 
	{
		boolean control;
		do 
		{
			double nota=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota: "));
					control=true;
					if (nota<5 && nota<=0) 
					{
						JOptionPane.showMessageDialog(null, "Suspendido");	
						
					}
					else if (nota>=5 && nota<6) 
					{
						JOptionPane.showMessageDialog(null, "Suficiente");	
				
					}
					else if (nota>=6 && nota<7) 
					{
						JOptionPane.showMessageDialog(null, "Bien");	
					
					}
					else if (nota>=7 && nota<9) 
					{
						JOptionPane.showMessageDialog(null, "Notable");	
			
					}
					else if (nota>=9 && nota<=10) 
					{
						JOptionPane.showMessageDialog(null, "Sobresaliente");
						break;
			
					}
					else if (nota<0 || nota>10) 
					{
						control=false;
					}
						} while (!control);
	}

}
