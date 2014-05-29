/*Escribe un programa que lea una serie de n�meros, muestre el primero, no el segundo, 
si el tercero y as� sucesivamente. 
Termina cuando insertamos un n�mero negativo. El n�mero negativo no se imprimir�.*/
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
