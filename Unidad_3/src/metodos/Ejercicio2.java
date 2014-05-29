/*
 Escriba un programa que lea temperaturas expresadas en grados Fahrenheit 
 y las convierta a grados Celsius mostrándola. 
 El programa finalizará cuando lea un valor de temperatura igual a 999. 
 La conversión de grados Farenheit (F) a Celsius (C) la realizará un método llamado 
 farenheitCelsius donde incluirás el código que hace la conversión (C = 5/9(F − 32)).
 */
package metodos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		double Fahrenheit=0;
		boolean seguir=true;
		while(seguir=true){
		System.out.println(seguir);
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la temperatura en grados Fahrenhei");
		Fahrenheit=teclado.nextDouble();
			if(Fahrenheit==999){
				seguir=false;
			}
		double Celsius=farenheitCelsius(Fahrenheit);
		System.out.println(Celsius+" grados Celsius");
		System.out.println(seguir);
		};

	}
	public static double farenheitCelsius(double Fahr){
		double Celsius=5*(Fahr-32)/9;
		return Celsius;
	}

}
