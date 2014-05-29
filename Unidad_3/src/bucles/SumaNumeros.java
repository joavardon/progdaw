//Escribe un programa que calcule la suma de 6 números que inserte el usuario a través del teclado.
package bucles;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {

		int suma = 0;
		for(int i=0;i<6;i++){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserta un numero: ");
		int numero=teclado.nextInt();
		suma=suma+numero;
		}
		System.out.println(suma);
	}

}
