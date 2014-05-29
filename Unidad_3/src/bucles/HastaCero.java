/*Pedir números hasta que se inserte un 0. Mostrar la cantidad de números leídos 
y el resultado de multiplicar todos ellos.*/
package bucles;

import java.util.Scanner;

public class HastaCero {


	public static void main(String[] args) {
		
		System.out.println("Elige un numero: ");
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		int leidos=0;
		int resultado=1;
		while(numero!=0){
			leidos++;
			resultado=resultado*numero;
			System.out.println("Elige otro numero: ");
			numero=teclado.nextInt();
		
			}
		
		System.out.println("Leidos: "+leidos);
		
		System.out.println("Resultado: "+resultado);
		
	}
}
