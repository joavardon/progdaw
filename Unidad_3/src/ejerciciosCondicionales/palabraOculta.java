/*Crea un programa que tiene una palabra oculta. 
El programa pregunta la contraseña al jugador, 
si la adivina muestra un mensaje de éxito. 
Si no, muestra el error.*/
package ejerciciosCondicionales;

import java.util.Scanner;

public class palabraOculta {
	public static void main(String[] args) {
	String palabraoculta="clave";
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce una palabra: ");
	String palabra=teclado.next();
	
	while (!palabraoculta.equals(palabra)){
		System.out.println("FALLASTE.Intentalo otra vez: ");
		palabra=teclado.next();
	}
	if (palabraoculta.equals(palabra)){
		System.out.println("ACERTASTE");
	}
	
	}

}
