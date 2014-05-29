package ejerciciosIniciales;

public class Revista extends Publicacion{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Revista: "+ getEditor() +" "+ getFecha()+ " "+numero;
	}
}
