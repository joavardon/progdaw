//Escribe un programa que visualice el m�s peque�o de tres n�meros.
package ejercicioinicial;

import java.util.Scanner;

public class TresNumeros {


	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un n�mero:");
		int num1=teclado.nextInt();
		System.out.print("Dime otro n�mero:");
		int num2=teclado.nextInt();
		System.out.print("Dime otro n�mero:");
		int num3=teclado.nextInt();
		if (num1>num2 && num1>num3){
			System.out.println("El mayor ES: "+num1);
		}
		if (num2>num1 && num2>num3){
			System.out.println("El mayor ES: "+num2);
		}
		if (num3>num2 && num3>num1){
			System.out.println("El mayor ES: "+num3);
		}
	}

}
