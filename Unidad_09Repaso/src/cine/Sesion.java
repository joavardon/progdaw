package cine;

public class Sesion extends Pelicula {
	private Pelicula pelicula;
	private String horaComienzo;
	private int sala;
	private String estreno;
	
	
	Sesion(String n,String h, int sa){
		super(n);
		this.horaComienzo=h;
		this.sala=sa;
	}
	
		
	
	public String toString(){
		return getNombre()+" "+" "+getHoraComienzo()+" "+getSala();
	}
	//Accesadores
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public String getHoraComienzo() {
		return horaComienzo;
	}
	public void setHoraComienzo(String horaComienzo) {
		this.horaComienzo = horaComienzo;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getEstreno() {
		return estreno;
	}
	public void setEstreno(String estreno) {
		this.estreno = estreno;
	}
	
}
