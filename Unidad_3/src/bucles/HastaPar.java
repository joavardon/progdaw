/*Escribir un programa que pida varios números hasta que el usuario inserte un número par. 
Hay que ir mostrando cada uno de los números insertados (excepto el par).*/
package bucles;

import java.util.Scanner;

public class HastaPar {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.println("Elige un numero: ");
		int numero=teclado.nextInt();
		String cadena="";
		while(numero%2!=0){
			
			System.out.println(numero);
			cadena=cadena+numero+" ";
			System.out.println("Elige un numero: ");
			numero=teclado.nextInt();
		}		
		System.out.println(cadena);
	}
}
