package clases_paquetes_metodosestaticos;

import Ejercicios.Temperatura;

public class PruebaTemperatura {

	
	public static void main(String[] args) {
		Temperatura t1=new Temperatura();
		t1.setCelsius(0);
		Temperatura t2=new Temperatura();
		t2.setFahrenheit(0);
		
		System.out.println(t1.getCelsius()+" grados Celsius son en Celsius: " +t1.getCelsius());
		System.out.println(t1.getCelsius()+" grados Celsius son en Fahrenheit: " +t1.getFahrenheit());
		System.out.println(t2.getFahrenheit()+" grados Fahrenheit son en Fahrenheit: " +t2.getFahrenheit());
		System.out.println(t2.getFahrenheit()+" grados Fahrenheit son en Celsius: " +t2.getCelsius());
		
		
		
		
		
		//Ejercicio3
		System.out.println("************************");
		System.out.println("Ejercicio 3");
		System.out.println(Temperatura.FahrenheitToCelsius(0));
		System.out.println(Temperatura.CelsiusToFahrenheit(0));
		
	}

}
