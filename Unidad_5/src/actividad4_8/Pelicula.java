package actividad4_8;

/*
 * Ejercicio 5 Imagina que quieres crear un programa que te permita organizar tus películas. 
 * Crearemos una clase Película donde recogemos toda la información relacionada con un film. 
 * Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres), 
 * fecha estreno, formato, etc. Crea un programa (clase Filmoteca) que permita: 
 * insertar, modificar, eliminar, buscar o visualizar una película.
 */

public class Pelicula {

	private String titulo;
	private String[] actores;
	private String[] directores;
	private String fechaEstreno;
	private String formato;

	public Pelicula() {

		this.titulo = "Sin título";
		this.actores = new String[1];
		for (int i = 0; i < this.actores.length; ++i) {

			this.actores[i] = "Sin actor";
		}
		this.directores = new String[1];
		for (int i = 0; i < this.directores.length; ++i) {

			this.directores[i] = "Sin director";
		}
		this.fechaEstreno = "Sin fecha";
		this.formato = "Sin formato";
	}

	public Pelicula(String titulo, String[] actores, String[] directores,
			String fechaEstreno, String formato) {

		this.titulo = titulo;
		this.actores = actores;
		this.directores = directores;
		this.fechaEstreno = fechaEstreno;
		this.formato = formato;
	}

	public String visualizar() {

		String actores = "";

		for (int i = 0; i < this.getActores().length; ++i) {

			actores += this.getActores()[i] + "\n";

		}

		String directores = "";

		for (int i = 0; i < this.getDirectores().length; ++i) {

			directores += this.getDirectores()[i] + "\n";

		}

		return String
				.format("===========================================\n"
						+ "Título: %s\nActores:\n%sDirectores:\n%sFecha de estreno: %s\nFormato: %s\n"
						+ "===========================================\n",
						this.getTitulo(), actores, directores,
						this.getFechaEstreno(), this.getFormato());
	}

	public Pelicula(String[] actores) {
		this.actores = actores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public String getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}

