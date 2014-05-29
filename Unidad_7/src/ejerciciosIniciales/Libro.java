package ejerciciosIniciales;

public class Libro extends Publicacion {
	private String autor;
	private String ISBN;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String toString() {
		return "Libro: "+ getEditor() +" "+ getFecha()+ " "+autor+ " "+ISBN;
	}
}
