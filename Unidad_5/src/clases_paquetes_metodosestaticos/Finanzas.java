/*Realiza una clase Finanzas que convierta dólares a euros y viceversa. 
Codifica los métodos dolaresToEuros y eurosToDolares. 
Prueba que dicha clase funciona correctamente haciendo conversiones 
entre euros y dólares. La clase tiene que tener:
Un constructor finanzas que establecerá el cambio Dólar-Euro en 1.36.
Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.*/

package clases_paquetes_metodosestaticos;

public class Finanzas {
	private float dolares;
	private float euros;
	float cambio;
	Finanzas(){
		this.euros=euros;
		this.dolares=dolares;
		this.cambio=(float) 1.36;
		
	}
	Finanzas(double cambio){
		this.euros=euros;
		this.dolares=dolares;
		this.cambio=(float) cambio;
		
	}
	public void dolaresToEuros(){
		System.out.println(this.dolares+" dolares son "+this.dolares/cambio+" euros");
	}
	public void eurosToDolares(){
		System.out.println(this.euros+" euros son "+this.euros*cambio+" dolares");
	}
	public float getDolares() {
		return dolares;
	}
	public void setDolares(float dolares) {
		this.dolares = dolares;
	}
	public float getEuros() {
		return euros;
	}
	public void setEuros(float euros) {
		this.euros = euros;
	}
	public float getCambio() {
		return cambio;
	}
	public void setCambio(float cambio) {
		this.cambio = cambio;
	}
}
