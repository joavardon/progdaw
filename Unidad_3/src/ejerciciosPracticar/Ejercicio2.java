/*Un programa que pida al usuario una contrase�a (en el programa escribe la palabra oculta que quieras). 
El programa volver� a pedir la contrase�a hasta que la adivine el jugador o se llege a los 3 intentos, 
lo que ocurra primero. 
Mostrar� un mensaje de aceptaci�n de la contrase�a o el de error por hacer tres intentos fallidos.*/

package ejerciciosPracticar;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su contrase�a: ");
		String contrase�a=teclado.next();
		//int contador=0;
		boolean acierto=false;
		/*
		do{
			System.out.println("Introduce una contrase�a: ");
			String contrase�a2=teclado.next();
		
		if(contrase�a.equals(contrase�a2)){
			acierto=true;
			System.out.println("Contrase�a aceptada");
			break;}
		else {
			contador++;
			if (contador==3){
			System.out.println("Error. Numero de intentos terminados");}
			}
		}while(acierto=false || contador<3 );
		}*/
		
		for (int i=0;acierto==false;i++){
			System.out.println("Introduce una contrase�a: ");
			String contrase�a2=teclado.next();
			if(contrase�a.equals(contrase�a2)){
				acierto=true;
				System.out.println("Contrase�a aceptada");}
			else if (i==2){
				System.out.println("Error. Numero de intentos terminados");
				acierto=true;}
				}
		}
		
	}


