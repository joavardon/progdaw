/*Ejercicio 6 Imagina que quieres crear un programa que te permita organizar tus películas. 
Crearemos una clase Película donde recogemos toda la información relacionada con un film.
Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres),
fecha estreno, formato, etc. Crea un programa (clase Filmoteca) 
que permita: insertar, modificar, eliminar, buscar o visualizar una película.*/
package actividad4_arrays;

public class Pelis {

	
	private String titulo;
	private String formato;
	private String[]actores;
	private String[]directores;
	private String fechaestreno;
	

		public Pelis(String titulo, String[] actores, String[] directores,
				String fechaestreno, String formato) {

			this.titulo = titulo;
			this.actores = actores;
			this.directores = directores;
			this.fechaestreno = fechaestreno;
			this.formato = formato;
		}

	public String visualizar() {

		String veractores = "";

		for (int i = 0; i < actores.length; ++i) {

			veractores += "actor "+(i+1)+": "+actores[i] + "\n";

		}

		String verdirectores = "";

		for (int i = 0; i < directores.length; ++i) {

			verdirectores += "director "+(i+1)+": "+directores[i] + "\n";

		}

		return veractores+verdirectores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaestreno() {
		return fechaestreno;
	}

	public void setFechaestreno(String fechaestreno) {
		this.fechaestreno = fechaestreno;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String[] getActores() {
		return actores;
	}

	public void setActores(String[] actores) {
		this.actores = actores;
	}

	public String[] getDirectores() {
		return directores;
	}

	public void setDirectores(String[] directores) {
		this.directores = directores;
	}
}
