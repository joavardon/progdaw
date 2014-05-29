/*Crea un programa que tiene un numero oculto (del 1 al 10). 
El programa pregunta el número al jugador,
si la adivina muestra un mensaje de éxito. Si no, muestra el error.*/
package ejerciciosCondicionales;

import java.util.Random;
import java.util.Scanner;

public class numOculto {

	
	public static void main(String[] args) {
		int oculto=(int)(Math.random()*10 + 1);
		//System.out.println(oculto);
		Scanner teclado=new Scanner(System.in);
		System.out.println("Intenta adivinar un numero de 1 a 10: ");
		int numero=teclado.nextInt();
		while(numero!=oculto){
			System.out.println("Fallaste, intentalo de nuevo");
			

			numero=teclado.nextInt();
		}
		
		if(numero==oculto){
			System.out.println("Acertaste");
		}

	}

}
