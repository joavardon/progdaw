/*
 * Ejercicio 5. Rotar una cadena a la derecha tantas veces como nos digan. 
 * El programa pedirá la cadena y el número de posiciones a rotar,
 *  así que si introducimos "Rotaciones de cadena" y el valor 4, 
 *  nos devolverá "denaRotaciones de ca"
 */
package cadenas;

import java.util.Scanner;

public class RotarCadena {
	public static String rotarCad(String c,int n){
		n=n%c.length();//para que si se pasa el numero de la l d ela cadena siga funcionando
		String cadena1=c.substring(0, c.length()-n);
		String cadena2=c.substring(c.length()-n,c.length());
		String resultado=cadena2.concat(cadena1);
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena=teclado.nextLine();
		System.out.println("Numero a rotar: ");
		int numero=teclado.nextInt();
		cadena=rotarCad(cadena,numero);
		System.out.println(cadena);
		
	}

}
