package ejercicio3;

public class Dado {
	private int tirada;
	
	Dado(int aleatorio){
		this.tirada=aleatorio;
	}
	public int tirar(){
		this.tirada=(int)(Math.random()*5+1);
		return this.tirada;
	}
	
	public String toString(){
		String cadena="";
		return cadena+getTirada();
	}
	
	
	public int getTirada() {
		return tirada;
	}

	public void setTirada(int tirada) {
		this.tirada = tirada;
	}
	
	
}
