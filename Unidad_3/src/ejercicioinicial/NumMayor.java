/*Escribe un programa que pida dos números y que visualice el número que sea mayor de los dos. 
Si los dos son iguales, imprimirá cualquiera de ellos.*/
package ejercicioinicial;

import java.util.Scanner;

public class NumMayor {

	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un número:");
		int numero1=teclado.nextInt();
		System.out.print("Dime otro número:");
		int numero2=teclado.nextInt();
		if (numero1>=numero2){
			System.out.println("El numero mayor es: "+numero1);
			
		}
		if (numero2>=numero1){
			System.out.println("El numero mayor es: "+numero2);
			
		}
	}

}
