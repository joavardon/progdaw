/*Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /. 
El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.*/
package ejercicioinicial;

import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un n�mero:");
		int num1=teclado.nextInt();
		System.out.print("Dime otro n�mero:");
		int num2=teclado.nextInt();
		System.out.print("Dime una operaci�n:");
		String operacion=teclado.next();
		if (operacion.equals("*")){
			int resultado=num1*num2;
			System.out.println(resultado);
		}
		else if (operacion.equals("/")){
			int resultado=num1/num2;
			System.out.println(resultado);
		}
		else if (operacion.equals("+")){
			int resultado=num1+num2;
			System.out.println(resultado);
		}
		else if (operacion.equals("-")){
			int resultado=num1-num2;
			System.out.println(resultado);
		}
		else {
			
			System.out.println("ERROR");
		}
		
		
	}

}
