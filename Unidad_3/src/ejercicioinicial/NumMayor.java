/*Escribe un programa que pida dos n�meros y que visualice el n�mero que sea mayor de los dos. 
Si los dos son iguales, imprimir� cualquiera de ellos.*/
package ejercicioinicial;

import java.util.Scanner;

public class NumMayor {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un n�mero:");
		int numero1=teclado.nextInt();
		System.out.print("Dime otro n�mero:");
		int numero2=teclado.nextInt();
		if (numero1>=numero2){
			System.out.println("El numero mayor es: "+numero1);
			
		}
		if (numero2>=numero1){
			System.out.println("El numero mayor es: "+numero2);
			
		}
	}

}
