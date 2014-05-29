/*Modifique el m�todo creado en el ejercicio 6.18 para formar el cuadrado de cualquier 
 * car�cter que est� contenido en el par�metro tipo car�cter caracterRelleno. Por ejemplo, 
 * si lado es 5 y caracterRelleno es �#�, el m�todo debe imprimir
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

