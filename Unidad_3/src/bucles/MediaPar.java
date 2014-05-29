/*Escribe un programa que pida tantos números como el usuario del programa indique al principio. 
El programa mostrará al final la media y si se ha insertado un número par.*/
package bucles;

import java.util.Scanner;

public class MediaPar {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿cuantos nuemros quieres usar?: ");
		int total=teclado.nextInt();
		int suma=0;
		int numero;
		float media=0;
		for (int i=1;i<total+1;i++){
			System.out.println("introduce un numero ");
			numero=teclado.nextInt();
				if (numero%2==0){
					System.out.println("El numero "+numero+" es par");
				}
				suma=suma+numero;
			
		}
		media=suma/total;
		System.out.println("la media es "+media);
	}

}
