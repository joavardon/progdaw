/*Escribir un programa que lea tantos n�meros como el usuario quiera
(hasta que se inserte un n�mero negativo).
El primer n�mero hay que visualizarlo en la pantalla.*/
package bucles;

import java.util.Scanner;

public class VerPrimerNum {


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.println("Elige un numero: ");
		int numero=teclado.nextInt();
		int contador=0;
		
		while (numero>0){
			contador++;
			if (contador==1){
				
				
				System.out.println(numero);
			}
			System.out.println("Elige un numero: ");
			numero=teclado.nextInt();
		}
		
	}

}
