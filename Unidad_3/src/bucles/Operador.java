/*Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/')
de forma que permita hacer una operaci�n, volver� a pedir al usuario el operador, 
para, con los mismos n�meros, volver a hacer otra operaci�n.
El programa terminar� cuando se inserte un caracter que no es un operador.*/
package bucles;

import java.util.Scanner;

public class Operador {

	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un n�mero:");
		int num1=teclado.nextInt();
		System.out.print("Dime otro n�mero:");
		int num2=teclado.nextInt();
		System.out.print("Dime una operaci�n:");
		String operacion=teclado.next();
		while(((operacion.equals("*")||operacion.equals("/")||operacion.equals("+")||operacion.equals("-")))){
		switch (operacion){
		case "*":
			operacion.equals("*");
			int resultado=num1*num2;
			System.out.println(resultado);
			break;
		case "/": 
			operacion.equals("/");
			resultado=num1/num2;
			System.out.println(resultado);
			break;
		case "+":
			resultado=num1+num2;
			System.out.println(resultado);
			break;
		case "-":
			resultado=num1-num2;
			System.out.println(resultado);
			break;
		
		}
		System.out.print("Dime una operaci�n:");	
		operacion=teclado.next();
	}}
}
