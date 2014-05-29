/*Modifica el ejercicio de la tabla de multiplicar de forma que el usuario 
vaya introduciendo números y se vayan imprimiendo las tablas correspondientes. 
El programa termina cuando se introduce un número no esté entre 1 y 10.*/
package buclesAnidados;

import java.util.Scanner;

public class Tablas {

	
	public static void main(String[] args) {
		int tabla;
		Scanner teclado=new Scanner(System.in);
		do{
			System.out.println("Elige una tabla de multiplicar: ");
			
			tabla=teclado.nextInt();
			
			if ((tabla<10 && tabla>0)){
				System.out.println("Has elegido la tabla del "+tabla);
				for(int i=1;i<11;i++){
				System.out.println(i+" * "+tabla+" = "+i*tabla);}
				}}
		while(tabla<10 && tabla>0);
				
			
		
	}

}
