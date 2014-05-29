/*Escribe un programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /. 
El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.*/
package ejercicioinicial;

import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un número:");
		int num1=teclado.nextInt();
		System.out.print("Dime otro número:");
		int num2=teclado.nextInt();
		System.out.print("Dime una operación:");
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
