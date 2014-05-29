/*Escriba un método llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo número de
filas y columnas) de asteriscos cuyo lado se especifique en el parámetro entero lado.
Por ejemplo, si lado es 4, el método
debe mostrar:
****
****
****
****

Incorpore este método a una aplicación que lea un valor entero para el parámetro lado que teclea el usuario, y despliegue
los asteriscos con el método cuadradoDeAsteriscos.*/
package metodos;

import java.util.Scanner;

public class Ejercicio_618 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Dame un numero: ");
		int lado=teclado.nextInt();
		cuadradoDeAsteriscos(lado);
	}

	public static void cuadradoDeAsteriscos(int lado){
		for(int i=0;i<lado;i++){
			for(int j=0;j<lado;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
