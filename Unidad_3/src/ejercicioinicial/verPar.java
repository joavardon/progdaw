/*Escribe un programa que pida un n�mero con el fin de visualizarlo
, siempre que dicho n�mero sea par.*/
package ejercicioinicial;

import java.util.Scanner;

public class verPar {
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un n�mero:");
		int numero=teclado.nextInt();
		
		if(numero%2==0){
			System.out.println("El numero par es: "+numero);
		}
		else{
			System.out.println("No es par");
		}
	}

}
