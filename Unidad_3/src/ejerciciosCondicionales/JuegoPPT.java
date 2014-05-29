/*El juego de piedra/papel/tijera. 
Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
Solo una ronda por ejecución.
//para obtener un número aleatorio en Java entre 1 y 3:

resultado = (int )(Math.random() * 3 + 1);*/
package ejerciciosCondicionales;

import java.util.Scanner;

public class JuegoPPT {

	
	public static void main(String[] args) {
		int resultado;
		resultado = (int )(Math.random() * 3 + 1);
		
		//1 piedra, 2 papel, 3 tijera.
		
		Scanner elige=new Scanner (System.in);
		
		System.out.println("Elige piedra(1),papel(2),o tijera(3): ");
		
		int jugada=elige.nextInt();
		System.out.println("El ordenador elige: "+resultado);
		if (jugada==1 && resultado==2){
			System.out.println("Gana el ordenador");
		}
		else if (jugada==1 && resultado==3){
			System.out.println("Ganas tú");
		}
		else if (jugada==1 && resultado==1){
			System.out.println("Empate");
		}
		
		if (jugada==2 && resultado==3){
			System.out.println("Gana el ordenador");
		}
		else if (jugada==2 && resultado==1){
			System.out.println("Ganas tú");
		}
		else if (jugada==2 && resultado==2){
			System.out.println("Empate");
		}
		
		if (jugada==3 && resultado==1){
			System.out.println("Gana el ordenador");
		}
		else if (jugada==3 && resultado==2){
			System.out.println("Ganas tú");
		}
		else if (jugada==3 && resultado==3){
			System.out.println("Empate");
		}
	}

}
