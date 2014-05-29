/*Modifique el método creado en el ejercicio 6.18 para formar el cuadrado de cualquier 
 * carácter que esté contenido en el parámetro tipo carácter caracterRelleno. Por ejemplo, 
 * si lado es 5 y caracterRelleno es “#”, el método debe imprimir
####
####
####
####
####
*/
package metodos;

import java.util.Scanner;

public class Ejercicio_619 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Dame un numero: ");
		int lado=teclado.nextInt();
		System.out.println("Dame una cadena: ");
		String cadena=teclado.next();
		char caracter=cadena.charAt(0);
		//caracter=cadena.toCharArray()[0];
		cuadradoDeAsteriscos(lado,caracter);
	}

	public static void cuadradoDeAsteriscos(int lado,char caracter){
		for(int i=0;i<lado;i++){
			for(int j=0;j<lado;j++){
				System.out.print(caracter);
			}
			System.out.println();
		}
		
	}
}

