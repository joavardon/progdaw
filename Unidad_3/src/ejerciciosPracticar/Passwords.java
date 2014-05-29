//array de varias palabras ocultas y que el usuario meta uno: si acierta ya está y si no que meta otra.

package ejerciciosPracticar;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Passwords {
	
	
	public static void main(String[] args) {
		
		String ocultas[]=new String[3];
		ocultas[0]="casa";
		ocultas[1]="perro";
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String contraseña=teclado.next();
		boolean encontrado=true;
		for(int i=0;i<ocultas.length && !encontrado;i++){
			if(contraseña.equals(ocultas[i]))encontrado=true;}
			if(encontrado){System.out.println("Enconrtrado");}
			
			
		

	}

}
