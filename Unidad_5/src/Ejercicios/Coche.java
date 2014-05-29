package Ejercicios;

public class Coche {
	private int velocidad;
	
	Coche(){
		this.velocidad=0;
	}

	public int getVelocidad() {
		return velocidad;
	}
	public void acelera(int mas){
		this.velocidad=velocidad+mas;
	}
	public void desacelera(int mas){
		this.velocidad=velocidad-mas;
	}
}
