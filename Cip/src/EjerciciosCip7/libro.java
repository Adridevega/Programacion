package EjerciciosCip7;

	public class libro 
	{
	 private String autor,titulo;
	 private int cantidadDeEjemplares, cantidadPrestados;
	 
	 	public libro() 
	 	{
	 		
	 	}
	 	public libro(String autor, String titulo, int cantidadesDeEjemplares, int cantidadPrestados) 
	 	{
	 		this.autor=autor;
	 		this.titulo=titulo;
	 		this.cantidadPrestados=cantidadPrestados;
	 		this.cantidadPrestados=cantidadPrestados;
	 	}
				public String getAutor() 
				{
					return autor;
				}
				public void setAutor(String autor) 
				{
					this.autor = autor;
				}
				public String getTitulo() {
					return titulo;
				}
				public void setTitulo(String titulo) 
				{
					this.titulo = titulo;
				}
				public int getCantidadDeEjemplares() 
				{
					return cantidadDeEjemplares;
				}
				public void setCantidadDeEjemplares(int cantidadDeEjemplares) 
				{
					this.cantidadDeEjemplares = cantidadDeEjemplares;
				}
				public int getCantidadPrestados() 
				{
					return cantidadPrestados;
				}
				public void setCantidadPrestados(int cantidadPrestados) 
				{
					this.cantidadPrestados = cantidadPrestados;
				}
				public boolean darPrestamo() 
				{
					boolean prestado=true;
					if (cantidadPrestados<cantidadDeEjemplares) 
					{
						cantidadPrestados++;
					}
					else 
					{
						prestado=false;
					}
					return prestado;
				}
				public boolean devuelveLibro() 
				{
					boolean devuelto=true;
					if(cantidadPrestados==0) 
					{
						devuelto=false;
					}
					else 
					{
						cantidadPrestados--;
					}
					return devuelto;
				}
 	
	}
