/*Un programa que pida al usuario una contraseña (en el programa escribe la palabra oculta que quieras). 
El programa volverá a pedir la contraseña hasta que la adivine el jugador o se llege a los 3 intentos, 
lo que ocurra primero. 
Mostrará un mensaje de aceptación de la contraseña o el de error por hacer tres intentos fallidos.*/

package ejerciciosPracticar;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su contraseña: ");
		String contraseña=teclado.next();
		//int contador=0;
		boolean acierto=false;
		/*
		do{
			System.out.println("Introduce una contraseña: ");
			String contraseña2=teclado.next();
		
		if(contraseña.equals(contraseña2)){
			acierto=true;
			System.out.println("Contraseña aceptada");
			break;}
		else {
			contador++;
			if (contador==3){
			System.out.println("Error. Numero de intentos terminados");}
			}
		}while(acierto=false || contador<3 );
		}*/
		
		for (int i=0;acierto==false;i++){
			System.out.println("Introduce una contraseña: ");
			String contraseña2=teclado.next();
			if(contraseña.equals(contraseña2)){
				acierto=true;
				System.out.println("Contraseña aceptada");}
			else if (i==2){
				System.out.println("Error. Numero de intentos terminados");
				acierto=true;}
				}
		}
		
	}


