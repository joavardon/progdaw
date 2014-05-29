/*Escriba un programa que simule el juego de adivinar un n�mero. 
El ordenador debe generar un n�mero entre 1 y 100 y el usuario tiene que intentar el adivinarlo. 
Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al usuario si
el n�mero a adivinar es mayor o menor que el introducido. Cuando consiga adivinarlo debe indic�rselo 
e imprimir en pantalla el n�mero de veces que el usuario ha intentado adivinar dicho n�mero. 
Estructura el programa con los m�todos que estimes necesarios,
teniendo en cuenta que debe ser lo m�s legible posible.*/
package metodos;

import java.util.Scanner;

public class Ejercicio5 {
	public static int generaNumero(){
		int numero=(int) (Math.random()*101+1);
		return numero;
	}
	public static void mayMen(int num){
		int numOrd=num;
		int numEleg;
		int fallos=0;
		do{
			Scanner teclado=new Scanner(System.in);
			System.out.println("Elige un n�mero: ");
			numEleg=teclado.nextInt();
	
	
		if (numEleg==num){
			System.out.println("Acertaste");
		}
		else if (numEleg>num){
			System.out.println("Es menor");
			fallos++;
		}
		else{
			System.out.println("Es mayor");
			fallos++;}
		
		
		}while(numEleg!=numOrd);
		System.out.println("cometiste "+fallos+" fallos");
	}
	public static void main(String[] args) {
		int numeroGen=generaNumero();
		
		mayMen(numeroGen);
	}

}
