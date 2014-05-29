/*Escriba un m�todo llamado enteroPotencia( base, exponente ) que devuelva el valor de base exponente
Por ejemplo, enteroPotencia( 3, 4 ) calcula 34 (o 3 * 3 * 3 * 3 ). 
Suponga que exponente es un entero positivo
distinto de cero y que base es un entero. El m�todo enteroPotencia 
debe utilizar un ciclo for o while para controlar
el c�lculo. No utilice ning�n m�todo de la biblioteca de matem�ticas. 
Incorpore este m�todo en una aplicaci�n que lea
valores enteros para base y exponente, y que realice el c�lculo con el m�todo enteroPotencia.*/
package metodos;

import java.util.Scanner;

public class Ejercicio_614 {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("base: ");
		int base=teclado.nextInt();
		System.out.println("exponente: ");
		int exponente=teclado.nextInt();
		System.out.println("El resultado es "+enteroPotencia(base, exponente));
	}
	public static int enteroPotencia(int base, int exponente){
		int resultado = base;
		
			if(exponente==0){
				resultado=1;
			}
			else if(exponente==1){
			resultado=base;
			}
			else{
				for(int i=0;i<exponente-1;i++){
					resultado=resultado*base;
				}
			}
		return resultado;
	}
}
