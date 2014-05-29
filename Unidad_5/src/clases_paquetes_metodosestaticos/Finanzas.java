/*Realiza una clase Finanzas que convierta d�lares a euros y viceversa. 
Codifica los m�todos dolaresToEuros y eurosToDolares. 
Prueba que dicha clase funciona correctamente haciendo conversiones 
entre euros y d�lares. La clase tiene que tener:
Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.*/

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
