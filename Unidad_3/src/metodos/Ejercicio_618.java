/*Escriba un m�todo llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo n�mero de
filas y columnas) de asteriscos cuyo lado se especifique en el par�metro entero lado.
Por ejemplo, si lado es 4, el m�todo
debe mostrar:
****
****
****
****

Incorpore este m�todo a una aplicaci�n que lea un valor entero para el par�metro lado que teclea el usuario, y despliegue
los asteriscos con el m�todo cuadradoDeAsteriscos.*/
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
