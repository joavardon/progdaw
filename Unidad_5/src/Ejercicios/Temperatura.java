package Ejercicios;

public class Temperatura {
	private float grados;

	public float getCelsius() {
		return grados;
	}

	public void setCelsius(float grados) {
		this.grados = grados;
	}
	
	public float getFahrenheit(){
		return ((grados*9)/5)+32; 
	}
	public void setFahrenheit(float grados){
		this.grados=((grados-32)*5)/9;
	}
	
	//metodo static celsiusToFahrenheit y FahrenheitToCelsius, de forma que puedan usarse sin necesidad de crear ningún objeto

	static float CelsiusToFahrenheit(float grados){
		grados=(grados*(9/5))+32;
		
		return grados;
	}
	static float FahrenheitToCelsius(float grados){
		grados=((grados-32)*5)/9;
		return grados;
	}
}
