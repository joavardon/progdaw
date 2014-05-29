/*Escribe un programa que lea una serie de números, muestre el primero, no el segundo, 
si el tercero y así sucesivamente. 
Termina cuando insertamos un número negativo. El número negativo no se imprimirá.*/
package bucles;

import java.util.Scanner;

public class MostrarAlternos {


	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);

		System.out.println("Elige un numero: ");
		int numero=teclado.nextInt();
		int contador = 1;
		String cadena="";
		while(numero>=0){
			if (contador%2!=0){
				System.out.println("Tu numero a mostrar "+numero);
				cadena=cadena+numero+" ";
			}
			contador++;
			System.out.println("Elige un numero: ");
			numero=teclado.nextInt();
		}
		System.out.println(cadena);
	}

}
